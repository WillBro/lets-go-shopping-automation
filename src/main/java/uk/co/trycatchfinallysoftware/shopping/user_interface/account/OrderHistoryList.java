package uk.co.trycatchfinallysoftware.shopping.user_interface.account;

import net.serenitybdd.screenplay.targets.Target;

public class OrderHistoryList {

    public static Target FIRST_ITEM = Target.the("")
            .locatedBy("table#order-list tr.first_item td.history_detail a");

    // @todo Create XPath selector to select by table row index, Order ID
}
