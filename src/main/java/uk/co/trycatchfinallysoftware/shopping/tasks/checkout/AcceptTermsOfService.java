package uk.co.trycatchfinallysoftware.shopping.tasks.checkout;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import uk.co.trycatchfinallysoftware.shopping.user_interface.checkout.Shipping;

public class AcceptTermsOfService implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Shipping.TERMS_OF_SERVICE_CHECKOUT)
        );
    }

    public static AcceptTermsOfService accept() {
        return new AcceptTermsOfService();
    }
}
