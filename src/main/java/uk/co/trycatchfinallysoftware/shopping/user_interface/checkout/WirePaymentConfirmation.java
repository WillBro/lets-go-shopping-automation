package uk.co.trycatchfinallysoftware.shopping.user_interface.checkout;

import net.serenitybdd.screenplay.targets.Target;

public class WirePaymentConfirmation {

    public static Target PRICE_INCL_TAX = Target.the("")
            .locatedBy("div.cheque-box amount");


    public static Target CURRENCY = Target.the("")
            .locatedBy("div.cheque-box p + b");
}
