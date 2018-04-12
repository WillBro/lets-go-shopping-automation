package uk.co.trycatchfinallysoftware.shopping.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import uk.co.trycatchfinallysoftware.shopping.user_interface.PrestaShopApp;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SignInHeader implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PrestaShopApp.HEADER_SIGNIN)
        );
    }

    public static SignInHeader signIn() {
        return instrumented(SignInHeader.class);
    }
}
