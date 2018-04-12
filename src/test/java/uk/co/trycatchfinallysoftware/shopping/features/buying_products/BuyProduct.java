package uk.co.trycatchfinallysoftware.shopping.features.buying_products;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.WithTag;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import uk.co.trycatchfinallysoftware.shopping.questions.CartSummaryOrderDescriptions;
import uk.co.trycatchfinallysoftware.shopping.questions.OrderProductsTotal;
import uk.co.trycatchfinallysoftware.shopping.questions.OrderTax;
import uk.co.trycatchfinallysoftware.shopping.questions.OrderTotalPrice;
import uk.co.trycatchfinallysoftware.shopping.tasks.Start;
import uk.co.trycatchfinallysoftware.shopping.tasks.ViewQuickviewProduct;
import uk.co.trycatchfinallysoftware.shopping.tasks.account.CreateAccount;
import uk.co.trycatchfinallysoftware.shopping.tasks.account.SignOut;
import uk.co.trycatchfinallysoftware.shopping.tasks.checkout.*;
import uk.co.trycatchfinallysoftware.shopping.tasks.quickview.AddProductToCart;
import uk.co.trycatchfinallysoftware.shopping.tasks.quickview.ContinueShopping;
import uk.co.trycatchfinallysoftware.shopping.tasks.quickview.IncreaseQuantityWanted;
import uk.co.trycatchfinallysoftware.shopping.tasks.quickview.ProceedToCheckout;
import uk.co.trycatchfinallysoftware.shopping.user_interface.QuickviewProductModal;
import uk.co.trycatchfinallysoftware.shopping.user_interface.ShoppingCart;
import uk.co.trycatchfinallysoftware.shopping.user_interface.checkout.Payment;
import uk.co.trycatchfinallysoftware.shopping.user_interface.checkout.signin.AccountCreate;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;

@RunWith(SerenityRunner.class)
@WithTag("Buying Product")
public class BuyProduct {

    private Actor jane = Actor.named("Jane");

    private static CurrencyUnit currencyUnit = CurrencyUnit.USD;

    @Managed
    private WebDriver theirBrowser;

    @Before
    public void theyCanBrowseTheWebWithDeskopResolution() {
        theirBrowser.manage().window().maximize();

        jane.can(BrowseTheWeb.with(theirBrowser));
    }

    @Test
    public void shouldBeAbleToBuyTwoProductsCreateAccountPayByWire() {
        givenThat(jane).wasAbleTo(Start.withAnEmptyCart());

        // Purchase First Product (changing size attribute)
        when(jane).attemptsTo(ViewQuickviewProduct.called("Blouse"));

        theirBrowser.switchTo().frame(
                theirBrowser.findElement(By.cssSelector(".fancybox-inner iframe"))
        ); // @todo abstract moving to other frame elsewhere

        when(jane).attemptsTo(
                SelectFromOptions.byVisibleText("L").from(QuickviewProductModal.SELECT_GROUP_ONE),
                AddProductToCart.addToCart(),
                ContinueShopping.continueShopping()
        );

        // Purchase Second Product (leaving default product attributes)
        when(jane).attemptsTo(ViewQuickviewProduct.called("Faded Short Sleeve T-shirts"));

        theirBrowser.switchTo().frame(
                theirBrowser.findElement(By.cssSelector(".fancybox-inner iframe"))
        ); // @todo abstract moving to other frame elsewhere (especially due to duplicated code)

        when(jane).attemptsTo(
                AddProductToCart.addToCart(),
                ProceedToCheckout.proceedToCheckout()
        );

        // Setup monetary calculation expectations to be used in asserting checkout summary totals
        // @todo Use Money values, Create Questions which return Money values and assert against Concrete objects
        Money blousePrice = Money.of(currencyUnit, 27.00d);
        Money fadedShortSleeveTshirtPrice = Money.of(currencyUnit, 16.51d);
        Money expectedShippingPrice = Money.of(currencyUnit, 2.00d);
        long taxRate = 1L;  // Apply no tax

        Money expectedProductTotalExcTax = blousePrice.plus(fadedShortSleeveTshirtPrice);
        Money expectedProductTotalIncTax = expectedProductTotalExcTax.multipliedBy(taxRate);
        Money expectedTotalPrice = expectedProductTotalIncTax.plus(expectedShippingPrice);

        then(jane).should(
                seeThat("Medium and Large sizes have been added",
                        CartSummaryOrderDescriptions.displayed(),
                        containsInAnyOrder("Color : Orange, Size : S", "Color : Black, Size : L")
                ),
                seeThat("Order tax calculation is correct", OrderTax.price(), is("$0.00")),
                seeThat("Product price calculates correctly", OrderProductsTotal.total(), is("$43.51")),
                seeThat("Order price equals price cost of products plus shipping", OrderTotalPrice.total(), is("$45.51"))
        );

        String testEmailAddress = "test+" + DateTime.now().getMillis() + "@example.com";
        String testPassword = "BJSSTest";

        // Save email address for usage in other Cases
        Serenity.setSessionVariable("email").to(testEmailAddress);
        Serenity.setSessionVariable("password").to(testPassword);

        // Progress through checkout process
        // @todo Setup jfairy Faker to create nice random data for Person and Address (as well as DAO)
        when(jane).attemptsTo(
                Click.on(ShoppingCart.PROCEED_TO_CHECKOUT),
                CreateAccount.withEmail(testEmailAddress),
                FillPersonalDetails.withDetails(
                        "Mrs",
                        "Jane",
                        "Norman",
                        testEmailAddress,
                        testPassword,
                        12,
                        4,
                        1963,
                        false,
                        false
                ),
                FillAddressDetails.withAddress(
                        "Line One",
                        "Houston",
                        "Texas",
                        "54212",
                        "United States",
                        "803 555 7238",
                        "Calling Houston"
                ),
                Click.on(AccountCreate.REGISTER),
                ProceedWithAddressSelection.proceed(),
                AcceptTermsOfService.accept(),
                ConfirmCarrier.confirmCarrier(),
                WirePayment.byWire(),
                Click.on(Payment.CONFIRM_ORDER)
        );

        jane.wasAbleTo(SignOut.signOut());
    }
}
