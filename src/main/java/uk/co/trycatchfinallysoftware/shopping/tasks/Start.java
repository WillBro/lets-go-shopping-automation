package uk.co.trycatchfinallysoftware.shopping.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import uk.co.trycatchfinallysoftware.shopping.actions.Refresh;
import uk.co.trycatchfinallysoftware.shopping.user_interface.ApplicationHomePage;

import java.util.Collection;
import java.util.Collections;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Start implements Task {

    private final Collection<String> products;
    private ApplicationHomePage applicationHomePage;

    @Step("{0} starts with viewing homepage")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(applicationHomePage),
                Refresh.theBrowserSession()
        );
    }

    public static Start withAnEmptyCart() {
        return instrumented(Start.class, Collections.EMPTY_LIST);
    }

    public Start(Collection<String> products) {
        this.products = products;
    }
}
