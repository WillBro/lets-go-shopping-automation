package uk.co.trycatchfinallysoftware.shopping.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCart {

    public static Target PROCEED_TO_CHECKOUT = Target.the("Shopping Cart page Proceed to Checkout Button")
            .locatedBy("p.cart_navigation a[title='Proceed to checkout']");
}
