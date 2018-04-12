package uk.co.trycatchfinallysoftware.shopping.user_interface.checkout;

import net.serenitybdd.screenplay.targets.Target;

public class OrderConfirmation {

    public static Target BACK_TO_ORDERS = Target.the("Click Order Confirmation 'Back to Orders'")
            .locatedBy("a[title='Back to orders']");
}
