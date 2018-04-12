package uk.co.trycatchfinallysoftware.shopping.tasks.account;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import uk.co.trycatchfinallysoftware.shopping.user_interface.account.OrderManagement;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ViewOrders implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OrderManagement.VIEW_ORDERS)
        );
    }

    public static ViewOrders viewOrders() {
        return instrumented(ViewOrders.class);
    }
}
