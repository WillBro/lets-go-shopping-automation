package uk.co.trycatchfinallysoftware.shopping.tasks.quickview;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import uk.co.trycatchfinallysoftware.shopping.user_interface.ShoppingCartOverlay;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ContinueShopping implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ShoppingCartOverlay.CONTINUE_BUTTON)
        );
    }

    public static ContinueShopping continueShopping() {
        return instrumented(ContinueShopping.class);
    }
}
