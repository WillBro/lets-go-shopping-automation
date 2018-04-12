package uk.co.trycatchfinallysoftware.shopping.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import uk.co.trycatchfinallysoftware.shopping.user_interface.ShoppingCartSummary;

public class OrderTax implements Question<String> {

    public static Question<String> price() {
        return actor -> Text.of(ShoppingCartSummary.TAX_PRICE).viewedBy(actor).as(String.class);
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ShoppingCartSummary.TAX_PRICE)
                .viewedBy(actor)
                .as(String.class);
    }
}
