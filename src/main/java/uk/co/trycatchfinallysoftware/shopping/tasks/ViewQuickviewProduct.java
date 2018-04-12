package uk.co.trycatchfinallysoftware.shopping.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hover;
import uk.co.trycatchfinallysoftware.shopping.user_interface.ApplicationHomePage;
import uk.co.trycatchfinallysoftware.shopping.user_interface.HomepageProductItem;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ViewQuickviewProduct implements Task {

    final String productName;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Hover.over(ApplicationHomePage.PRODUCT.of(productName)),
                Click.on(HomepageProductItem.QUICKVIEW)
        );
    }

    public static ViewQuickviewProduct called(String productName) {
        return instrumented(ViewQuickviewProduct.class, productName);
    }

    public ViewQuickviewProduct(String productName) {
        this.productName = productName;
    }
}
