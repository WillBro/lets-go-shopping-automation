package uk.co.trycatchfinallysoftware.shopping.tasks.cartsummary;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import uk.co.trycatchfinallysoftware.shopping.user_interface.ShoppingCart;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ViewCartPageProceedCheckout implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ShoppingCart.PROCEED_TO_CHECKOUT)
        );
    }

    public static ViewCartPageProceedCheckout proceed() {
        return instrumented(ViewCartPageProceedCheckout.class);
    }
}
