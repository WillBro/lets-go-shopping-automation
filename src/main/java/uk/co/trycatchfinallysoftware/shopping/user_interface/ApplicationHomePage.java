package uk.co.trycatchfinallysoftware.shopping.user_interface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com")
public class ApplicationHomePage extends PageObject {

    public static Target FEATURED_PRODUCTS = Target.the("Homepage Products List")
            .locatedBy(".tab-content #homefeatured li");

    public static Target FEATURED_PRODUCT_NAMES = Target.the("Homepage Products Name List")
            .locatedBy(".tab-content #homefeatured li a.product-name");

    public static Target PRODUCT = Target.the("Homepage Featured Product by Name")
            .locatedBy("//a[@class='product-name' and @title='{0}']");
}