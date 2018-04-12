package uk.co.trycatchfinallysoftware.shopping.user_interface.account;

import net.serenitybdd.screenplay.targets.Target;

public class OrderHistoryItem {

    public static Target PRODUCTS = Target.the("")
            .locatedBy("#order-detail-content table tbody tr.item");

    public static Target MESSAGE_TEXT = Target.the("")
            .locatedBy("form#sendOrderMessage textarea[name='msgText']");

    public static Target SUBMIT_MESSAGE = Target.the("")
            .locatedBy("form#sendOrderMessage button[type='Submit'][name='submitMessage']");

    public static Target MESSAGES = Target.the("")
            .locatedBy("table.detail_step_by_step tr");
}
