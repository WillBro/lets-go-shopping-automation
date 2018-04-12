package uk.co.trycatchfinallysoftware.shopping.user_interface.account;

import net.serenitybdd.screenplay.targets.Target;

public class OrderManagement {

    public static Target VIEW_ORDERS = Target.the("")
            .locatedBy("ul.myaccount-link-list a[title='Orders']");

    // @todo Credit Slips, Addresses, Personal Information and Wishlist
}
