package uk.co.trycatchfinallysoftware.shopping.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import uk.co.trycatchfinallysoftware.shopping.user_interface.account.OrderHistoryList;

import java.util.List;

public class OrderHistoryOrderReferences implements Question<List<String>> {

    public static Question<List<String>> displayed() {
        return actor -> Text.of(OrderHistoryList.ORDER_IDS).viewedBy(actor).asList();
    }

    @Override
    public List<String> answeredBy(Actor actor) {
        return Text.of(OrderHistoryList.ORDER_IDS)
                .viewedBy(actor)
                .asList();
    }
}
