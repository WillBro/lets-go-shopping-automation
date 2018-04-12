package uk.co.trycatchfinallysoftware.shopping.tasks.checkout;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import uk.co.trycatchfinallysoftware.shopping.user_interface.checkout.Shipping;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 *
 */
public class ConfirmCarrier implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Shipping.CONFIRM_CARRIER)
        );
    }

    public static ConfirmCarrier confirmCarrier() {
        return instrumented(ConfirmCarrier.class);
    }
}
