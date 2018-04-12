package uk.co.trycatchfinallysoftware.shopping.tasks.account;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import uk.co.trycatchfinallysoftware.shopping.user_interface.account.OrderHistoryItem;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddMessageToOrder implements Task {

    private final String message;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(message).into(OrderHistoryItem.MESSAGE_TEXT),
                Click.on(OrderHistoryItem.SUBMIT_MESSAGE)
        );
    }

    public static AddMessageToOrder withMessage(String message) {
        return instrumented(AddMessageToOrder.class, message);
    }

    public AddMessageToOrder(String message) {
        this.message = message;
    }
}
