package uk.co.trycatchfinallysoftware.shopping.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class QuickviewProductModal {

    public static Target PRODUCT_NAME = Target.the("Product Name")
            .locatedBy("h1[itemprop'name']");

    public static Target QUANTITY_WANTED = Target.the("Current Product Quantity")
            .locatedBy("input#quantity_wanted");

    public static Target QUANTITY_BUTTON_UP = Target.the("Click Quantity Up Button")
            .locatedBy("form#buy_block a.product_quantity_up span");

    public static Target QUANTITY_BUTTON_DOWN = Target.the("Click Quantity Down Button")
            .locatedBy("form#buy_block a.product_quantity_down span");

    public static Target PRODUCT_ATTRIBUTES = Target.the("Get Product Attributes")
            .locatedBy("form#buy_block fieldset.attribute_fieldset");

    public static Target ADD_TO_CART_BUTTON = Target.the("Add Product to Cart")
            .locatedBy("form#buy_block p#add_to_cart button[type='submit']");

    public static Target ADD_TO_WISHLIST_BUTTON = Target.the("Add Product to Wishlist")
            .locatedBy("form#buy_block a#wishlist_button");

    public static Target CLOSE_QUICKVIEW = Target.the("Close Product Quickview")
            .locatedBy("a.fancybox-close");

    // Size
    // @todo Refactor as its unlikely these groups will be the same for each product category
    public static Target SELECT_GROUP_ONE = Target.the("Select attribute group 1")
            .locatedBy("form#buy_block select#group_1");
}
