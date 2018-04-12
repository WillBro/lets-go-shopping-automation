package uk.co.trycatchfinallysoftware.shopping.tasks.account;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import uk.co.trycatchfinallysoftware.shopping.user_interface.account.OrderHistoryList;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ViewFirstOrderHistory implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OrderHistoryList.FIRST_ITEM)
        );
    }

    public static ViewFirstOrderHistory viewFirstOrder() {
        return instrumented(ViewFirstOrderHistory.class);
    }
}
