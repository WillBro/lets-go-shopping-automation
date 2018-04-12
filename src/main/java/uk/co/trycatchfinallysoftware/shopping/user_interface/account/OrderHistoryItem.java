package uk.co.trycatchfinallysoftware.shopping.user_interface.account;

import net.serenitybdd.screenplay.targets.Target;

public class OrderHistoryItem {

    public static Target PRODUCTS = Target.the("Order Detail Row")
            .locatedBy("#order-detail-content table tbody tr.item");

    public static Target MESSAGE_TEXT = Target.the("Order Detail Add Message")
            .locatedBy("form#sendOrderMessage textarea[name='msgText']");

    public static Target SUBMIT_MESSAGE = Target.the("Add Order Detail Message")
            .locatedBy("form#sendOrderMessage button[type='Submit'][name='submitMessage']");

    // @todo Fix XPath to select Message bodies
    // cssSelector h3.page-heading:contains(Messages) + .table_block table tr td:nth-child(2)
    public static Target MESSAGE_BODY = Target.the("Order Messages Content")
            .locatedBy("//*[@id=\"block-order-detail\"]/div[5]/table/tbody/tr/td[2]");
}
