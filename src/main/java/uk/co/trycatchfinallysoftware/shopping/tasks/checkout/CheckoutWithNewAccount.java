package uk.co.trycatchfinallysoftware.shopping.tasks.checkout;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import uk.co.trycatchfinallysoftware.shopping.user_interface.Authentication;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CheckoutWithNewAccount implements Task {

    private final String emailAddress;

    @Step("{0} creates new account")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(emailAddress).into(Authentication.CREATE_EMAIL_INPUT),
                Click.on(Authentication.CREATE_ACCOUNT_BUTTON)
        );
    }

    public static CheckoutWithNewAccount withEmailAddress(String emailAddress) {
        return instrumented(CheckoutWithNewAccount.class, emailAddress);
    }

    public CheckoutWithNewAccount(String withEmailAddress) {
        this.emailAddress = withEmailAddress;
    }
}
