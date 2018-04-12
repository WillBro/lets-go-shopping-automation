package uk.co.trycatchfinallysoftware.shopping.features.review_order;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.WithTag;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import uk.co.trycatchfinallysoftware.shopping.questions.OrderHistoryOrderReferences;
import uk.co.trycatchfinallysoftware.shopping.questions.OrderMessages;
import uk.co.trycatchfinallysoftware.shopping.tasks.SignInHeader;
import uk.co.trycatchfinallysoftware.shopping.tasks.Start;
import uk.co.trycatchfinallysoftware.shopping.tasks.account.AddMessageToOrder;
import uk.co.trycatchfinallysoftware.shopping.tasks.account.SignIn;
import uk.co.trycatchfinallysoftware.shopping.tasks.account.ViewFirstOrderHistory;
import uk.co.trycatchfinallysoftware.shopping.tasks.account.ViewOrders;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;

@RunWith(SerenityRunner.class)
@WithTag("Order Management")
public class OrderReview {

    private Actor jane = Actor.named("Jane");

    @Managed
    private WebDriver theirBrowser;

    @Before
    public void theyCanBrowseTheWebWithDeskopResolution() {
        theirBrowser.manage().window().maximize();

        jane.can(BrowseTheWeb.with(theirBrowser));
    }

    @Test
    public void shouldBeAbleToAddMessageToExistingOrder() {
        givenThat(jane).wasAbleTo(Start.withAnEmptyCart());

        String loginWithEmail = "test+12342342343@example.com";
        String loginWithPassword = "testtest";

        // @todo Use Session stored variable
//        String loginWithEmail = Serenity.sessionVariableCalled("email");
//        String loginWithPassword = Serenity.sessionVariableCalled("password");

        String message = "This is a test message " + DateTime.now().getMillis();

        when(jane).attemptsTo(
                SignInHeader.signIn(),
                SignIn.withCredentials(loginWithEmail, loginWithPassword),
                ViewOrders.viewOrders(),
                ViewFirstOrderHistory.viewFirstOrder(),
                AddMessageToOrder.withMessage(message)
        );

        then(jane).should(seeThat("That message has been added with correct text",
                OrderMessages.listMessages(),
                containsInAnyOrder(message))
        );
    }

    @Test
    @Screenshots(onlyOnFailures = true)
    public void shouldTakeScreenshotWhenOrderIdAssertionFailed() {
        givenThat(jane).wasAbleTo(Start.withAnEmptyCart());

        // @todo Use Serenity.Session stored variables
        String loginWithEmail = "test+12342342343@example.com";
        String password = "testtest";

        when(jane).attemptsTo(
                SignInHeader.signIn(),
                SignIn.withCredentials(loginWithEmail, password),
                ViewOrders.viewOrders()
        );

        // Asserting an non-existent Order ID to generate screenshot.
        then(jane).should(seeThat("Order History contains expected Order ID",
                OrderHistoryOrderReferences.displayed(),
                contains("ZKIINJBES")
        ));
    }
}
