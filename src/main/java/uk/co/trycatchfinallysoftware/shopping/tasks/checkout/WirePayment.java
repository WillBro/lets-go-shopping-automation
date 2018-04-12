package uk.co.trycatchfinallysoftware.shopping.tasks.checkout;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import uk.co.trycatchfinallysoftware.shopping.user_interface.checkout.Payment;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WirePayment implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Payment.BY_WIRE)
        );
    }

    public static WirePayment byWire() {
        return instrumented(WirePayment.class);
    }
}
