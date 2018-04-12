package uk.co.trycatchfinallysoftware.shopping.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import uk.co.trycatchfinallysoftware.shopping.user_interface.QuickviewProductModal;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CloseQuickviewModal implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(QuickviewProductModal.CLOSE_QUICKVIEW)
        );
    }

    public static CloseQuickviewModal close() {
        return instrumented(CloseQuickviewModal.class);
    }
}
