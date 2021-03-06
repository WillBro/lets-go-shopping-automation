package uk.co.trycatchfinallysoftware.shopping.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartSummary {

    public static Target PRODUCT_DESCRIPTIONS = Target.the("Product Descriptions")
            .locatedBy("table#cart_summary td.cart_description small a");

    public static Target TOTAL_PRICE_PRODUCTS = Target.the("")
            .locatedBy("table#cart_summary tr.cart_total_price td.price");

    public static Target TOTAL_PRICE_SHIPPING = Target.the("")
            .locatedBy("table#cart_summary tr.cart_total_delivery td.price");

    public static Target TOTAL_PRICE_BEFORE_TAX = Target.the("")
            .locatedBy("table#cart_summary #total_price_without_tax");

    public static Target TAX_PRICE = Target.the("")
            .locatedBy("table#cart_summary #total_tax");

    public static Target TOTAL_PRICE_AFTER_TAX = Target.the("")
            .locatedBy("table#cart_summary span#total_price");
}
