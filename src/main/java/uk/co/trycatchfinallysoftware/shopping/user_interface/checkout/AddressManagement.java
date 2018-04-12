package uk.co.trycatchfinallysoftware.shopping.user_interface.checkout;

import net.serenitybdd.screenplay.targets.Target;

public class AddressManagement {

    public static Target SELECT_ADDRESS_BY_ALIAS = Target.the("")
            .locatedBy("select#id_address_delivery");


    public static Target BILLING_SAME_AS_SHIPPING = Target.the("")
            .locatedBy("label[for='addressesAreEquals']");


    public static Target UPDATE_DELIVERY_ADDRESS = Target.the("")
            .locatedBy("#address_delivery li.address_update a");


    public static Target UPDATE_BILLING_ADDRESS = Target.the("")
            .locatedBy("#address_invoice li.address_update a");


    public static Target ADD_NEW_ADDRESS = Target.the("")
            .locatedBy("p.address_add a");


    public static Target ORDER_COMMENT = Target.the("")
            .locatedBy("#ordermsg textarea[name='message']");


    public static Target CONTINUE_SHIPPING = Target.the("")
            .locatedBy("p.cart_navigation a");


    public static Target PROCEED = Target.the("")
            .locatedBy("p.cart_navigation button[name='processAddress']");
}
