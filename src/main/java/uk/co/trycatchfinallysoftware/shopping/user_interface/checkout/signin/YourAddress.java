package uk.co.trycatchfinallysoftware.shopping.user_interface.checkout.signin;

import net.serenitybdd.screenplay.targets.Target;

public class YourAddress {

    public static Target ADDRESS_LINE_ONE = Target.the("")
            .locatedBy("#address1");

    public static Target CITY = Target.the("")
            .locatedBy("#city");

    public static Target POSTCODE = Target.the("")
            .locatedBy("#postcode");

    public static Target STATE = Target.the("")
            .locatedBy("#id_state");

    public static Target COUNTRY = Target.the("")
            .locatedBy("#id_country");

    public static Target PHONE = Target.the("")
            .locatedBy("#phone");

    public static Target MOBILE_PHONE = Target.the("")
            .locatedBy("#phone_mobile");

    public static Target ALIAS = Target.the("")
            .locatedBy("#alias");
}
