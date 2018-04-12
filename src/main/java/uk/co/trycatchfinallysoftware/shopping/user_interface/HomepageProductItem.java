package uk.co.trycatchfinallysoftware.shopping.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;

public class HomepageProductItem {

    public static Target NAME = Target.the("Product Name")
            .locatedBy("h5[itemprop='name']");

    public static Target DESCRIPTION = Target.the("Product Description")
            .locatedBy("p[itemprop='description']");

    public static Target PRICE = Target.the("Product Price")
            .locatedBy("span[itemprop='price']");

    public static Target CURRENCY = Target.the("Products Price Currency")
            .locatedBy("meta[itemprop='priceCurrency']");

    public static Target QUICKVIEW = Target.the("Product Quickview")
            .locatedBy("li.hovered a.quick-view");
}
