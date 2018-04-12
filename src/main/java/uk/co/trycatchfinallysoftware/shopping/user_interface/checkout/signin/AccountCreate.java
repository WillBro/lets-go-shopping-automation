package uk.co.trycatchfinallysoftware.shopping.user_interface.checkout.signin;

import net.serenitybdd.screenplay.targets.Target;

public class AccountCreate {

    public static Target REGISTER = Target.the("")
            .locatedBy("form#account-creation_form button[type='submit']");
}
