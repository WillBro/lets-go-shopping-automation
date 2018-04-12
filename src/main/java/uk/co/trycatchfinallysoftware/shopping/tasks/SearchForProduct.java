package uk.co.trycatchfinallysoftware.shopping.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import uk.co.trycatchfinallysoftware.shopping.user_interface.PrestaShopApp;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

public class SearchForProduct implements Task {

    private final String productName;

    @Step("{0} searches for product with name {1}")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(productName)
                        .into(PrestaShopApp.SEARCH_INPUT)
                        .thenHit(ENTER)
        );
    }

    public static SearchForProduct called(String productName) {
        return instrumented(SearchForProduct.class, productName);
    }

    public SearchForProduct(String productName) {
        this.productName = productName;
    }
}
