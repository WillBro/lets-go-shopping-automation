package uk.co.trycatchfinallysoftware.shopping.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import uk.co.trycatchfinallysoftware.shopping.user_interface.ApplicationHomePage;

import java.util.List;

public class TheDisplayedFeaturedProducts implements Question<List<String>> {

    public Question<List<String>> displayed() {
        return actor -> Text.of(ApplicationHomePage.FEATURED_PRODUCT_NAMES).viewedBy(actor).asList();
    }

    @Override
    public List<String> answeredBy(Actor actor) {
        return Text.of(ApplicationHomePage.FEATURED_PRODUCT_NAMES)
                .viewedBy(actor)
                .asList();
    }
}
