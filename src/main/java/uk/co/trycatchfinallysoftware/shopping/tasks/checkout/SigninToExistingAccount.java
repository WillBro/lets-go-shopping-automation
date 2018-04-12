package uk.co.trycatchfinallysoftware.shopping.tasks.checkout;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import uk.co.trycatchfinallysoftware.shopping.user_interface.Authentication;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SigninToExistingAccount implements Task {

    private final String emailAddress;
    private final String passwd;

    @Step("{0} signin to existing account")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(emailAddress).into(Authentication.SIGNIN_EMAIL_INPUT),
                Enter.theValue(passwd).into(Authentication.SIGNIN_PASSWD_INPUT),
                Click.on(Authentication.SIGNIN_BUTTON)
        );
    }

    public static SigninToExistingAccount withCredentials(String emailAddress, String passwd) {
        return instrumented(SigninToExistingAccount.class, emailAddress, passwd);
    }

    public SigninToExistingAccount(String withEmailAddress, String withPasswd) {
        this.emailAddress = withEmailAddress;
        this.passwd = withPasswd;
    }
}
