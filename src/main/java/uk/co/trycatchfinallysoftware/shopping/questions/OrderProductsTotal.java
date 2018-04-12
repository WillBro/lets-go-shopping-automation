package uk.co.trycatchfinallysoftware.shopping.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import uk.co.trycatchfinallysoftware.shopping.user_interface.ShoppingCartSummary;

public class OrderProductsTotal implements Question<String> {

    public static Question<String> total() {
        return actor -> Text.of(ShoppingCartSummary.TOTAL_PRICE_PRODUCTS).viewedBy(actor).as(String.class);
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ShoppingCartSummary.TOTAL_PRICE_PRODUCTS)
                .viewedBy(actor)
                .as(String.class);
    }
}
