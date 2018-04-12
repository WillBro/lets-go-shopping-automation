package uk.co.trycatchfinallysoftware.shopping.user_interface.checkout;

import net.serenitybdd.screenplay.targets.Target;

public class Shipping {
    
    public static Target TERMS_OF_SERVICE_CHECKOUT = Target.the("")
            .locatedBy("form[name='carrier_area'] label[for='cgv']");

    public static Target CONFIRM_CARRIER = Target.the("")
            .locatedBy("p.cart_navigation button[name='processCarrier']");
}
