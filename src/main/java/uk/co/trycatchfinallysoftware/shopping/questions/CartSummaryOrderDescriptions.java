package uk.co.trycatchfinallysoftware.shopping.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import uk.co.trycatchfinallysoftware.shopping.user_interface.ShoppingCartSummary;

import java.util.List;

public class CartSummaryOrderDescriptions implements Question<List<String>> {

    public static Question<List<String>> displayed() {
        return actor -> Text.of(ShoppingCartSummary.PRODUCT_DESCRIPTIONS).viewedBy(actor).asList();
    }

    @Override
    public List<String> answeredBy(Actor actor) {
        return Text.of(ShoppingCartSummary.PRODUCT_DESCRIPTIONS)
                .viewedBy(actor)
                .asList();
    }
}
