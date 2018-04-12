package uk.co.trycatchfinallysoftware.shopping.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import uk.co.trycatchfinallysoftware.shopping.user_interface.account.OrderHistoryItem;

import java.util.List;

public class OrderProducts implements Question<List<String>> {

    @Override
    public List<String> answeredBy(Actor actor) {
        return Text.of(OrderHistoryItem.PRODUCTS)
                .viewedBy(actor)
                .asList();
    }
}
