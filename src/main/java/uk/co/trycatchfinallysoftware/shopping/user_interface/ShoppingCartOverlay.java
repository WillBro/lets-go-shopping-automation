package uk.co.trycatchfinallysoftware.shopping.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartOverlay {

    public static Target CONTINUE_BUTTON = Target.the("Shopping Cart Continue Button")
            .locatedBy("#layer_cart span.continue");

    // @todo Determine more reliable selector rather than title which may be change.
    public static Target PROCEED_TO_CHECKOUT_BUTTON = Target.the("Shopping Cart Proceed to Checkout Button")
            .locatedBy("#layer_cart a[title='Proceed to checkout']");
}
