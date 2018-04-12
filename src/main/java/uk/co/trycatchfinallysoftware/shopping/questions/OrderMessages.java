package uk.co.trycatchfinallysoftware.shopping.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import uk.co.trycatchfinallysoftware.shopping.user_interface.account.OrderHistoryItem;

import java.util.List;

public class OrderMessages implements Question<List<String>> {

    public static Question<List<String>> listMessages() {
        return actor -> Text.of(OrderHistoryItem.MESSAGE_BODY).viewedBy(actor).asList();
    }

    @Override
    public List<String> answeredBy(Actor actor) {
        return Text.of(OrderHistoryItem.MESSAGE_BODY)
                .viewedBy(actor)
                .asList();
    }
}
