package uk.co.trycatchfinallysoftware.shopping.tasks.account;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import uk.co.trycatchfinallysoftware.shopping.user_interface.Authentication;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateAccount implements Task {

    private final String email;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(email).into(Authentication.CREATE_EMAIL_INPUT),
                Click.on(Authentication.CREATE_ACCOUNT_BUTTON)
        );
    }

    public static CreateAccount withEmail(String email) {
        return instrumented(CreateAccount.class, email);
    }

    public CreateAccount(String email) {
        this.email = email;
    }
}
