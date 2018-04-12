package uk.co.trycatchfinallysoftware.shopping.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class SearchPage {

    public static Target SEARCH_TERM = Target.the("Search Term").locatedBy("");

    public static Target HEADING_COUNTER = Target.the("Heading Counter")
            .locatedBy("h1. page-heading span.heading-counter");
}
