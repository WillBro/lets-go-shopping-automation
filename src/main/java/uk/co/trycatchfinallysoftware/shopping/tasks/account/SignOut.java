package uk.co.trycatchfinallysoftware.shopping.tasks.account;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import uk.co.trycatchfinallysoftware.shopping.user_interface.PrestaShopApp;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SignOut implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PrestaShopApp.HEADER_SIGNOUT)
        );
    }

    public static SignOut signOut() {
        return instrumented(SignOut.class);
    }

    public SignOut SignOut() {
        return new SignOut();
    }
}
