package uk.co.trycatchfinallysoftware.shopping.user_interface.checkout;

import net.serenitybdd.screenplay.targets.Target;

public class Payment {

    public static Target BY_WIRE = Target.the("")
            .locatedBy("div#HOOK_PAYMENT a[title='Pay by bank wire']");

    public static Target BY_CHECK = Target.the("")
            .locatedBy("a.cheque");

    public static Target CONFIRM_ORDER = Target.the("")
            .locatedBy(".cart_navigation button[type='submit']");
}

