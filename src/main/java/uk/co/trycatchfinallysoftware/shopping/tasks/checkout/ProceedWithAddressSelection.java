package uk.co.trycatchfinallysoftware.shopping.tasks.checkout;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import uk.co.trycatchfinallysoftware.shopping.user_interface.checkout.AddressManagement;

public class ProceedWithAddressSelection implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AddressManagement.PROCEED)
        );
    }

    public static ProceedWithAddressSelection proceed() {
        return new ProceedWithAddressSelection();
    }
}
