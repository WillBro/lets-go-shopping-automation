package uk.co.trycatchfinallysoftware.shopping.tasks.account;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import uk.co.trycatchfinallysoftware.shopping.user_interface.Authentication;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SignIn implements Task {

    private final String email;
    private final String passwd;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(email).into(Authentication.SIGNIN_EMAIL_INPUT),
                Enter.theValue(passwd).into(Authentication.SIGNIN_PASSWD_INPUT),
                Click.on(Authentication.SIGNIN_BUTTON)
        );
    }

    public static SignIn withCredentials(String email, String passwd) {
        return instrumented(SignIn.class, email, passwd);
    }

    public SignIn(String email, String passwd) {
        this.email = email;
        this.passwd = passwd;
    }
}
