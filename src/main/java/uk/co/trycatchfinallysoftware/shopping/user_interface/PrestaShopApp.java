package uk.co.trycatchfinallysoftware.shopping.user_interface;


import net.serenitybdd.screenplay.targets.Target;

public class PrestaShopApp {

    public static Target PAGE_HEADING = Target.the("Page Heading")
            .locatedBy("h1.page-heading");

    public static Target SEARCH_INPUT = Target.the("Search Input")
            .locatedBy("form#searchbox input#search_query_top");

    public static Target SHOPPING_CART = Target.the("Shopping Cart")
            .locatedBy("header#header .shopping_cart a");

    public static Target HEADER_SIGNIN = Target.the("Signin Button")
            .locatedBy("nav .header_user_info a.login");

    public static Target HEADER_SIGNOUT = Target.the("Logout Button")
            .locatedBy("nav .header_user_info a.logout");

    public static Target MY_ACCOUNT = Target.the("My Account Link")
            .locatedBy("a.account");
}
