package uk.co.trycatchfinallysoftware.shopping.user_interface.checkout.signin;

import net.serenitybdd.screenplay.targets.Target;

public class YourAddress {

    public static Target ADDRESS_LINE_ONE = Target.the("Enter address line one")
            .locatedBy("#address1");

    public static Target CITY = Target.the("Enter City")
            .locatedBy("#city");

    public static Target POSTCODE = Target.the("Enter Postcode")
            .locatedBy("#postcode");

    public static Target STATE = Target.the("Choose State")
            .locatedBy("#id_state");

    public static Target COUNTRY = Target.the("Choose Country")
            .locatedBy("#id_country");

    public static Target PHONE = Target.the("Enter home phone number")
            .locatedBy("#phone");

    public static Target MOBILE_PHONE = Target.the("Enter mobile phone number")
            .locatedBy("#phone_mobile");

    public static Target ALIAS = Target.the("Enter address alias")
            .locatedBy("#alias");
}
