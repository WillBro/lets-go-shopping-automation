package uk.co.trycatchfinallysoftware.shopping.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class Authentication {
    
    public static Target CREATE_EMAIL_INPUT = Target.the("CreateAccount Account with Email Input")
            .locatedBy("form#create-account_form input#email_create");

    public static Target CREATE_ACCOUNT_BUTTON = Target.the("CreateAccount Account Button")
            .locatedBy("form#create-account_form button#SubmitCreate");

    public static Target SIGNIN_EMAIL_INPUT = Target.the("Signin with Email Input")
            .locatedBy("form#login_form input#email");

    public static Target SIGNIN_PASSWD_INPUT = Target.the("Signin with Password Input")
            .locatedBy("form#login_form input#passwd");

    public static Target SIGNIN_BUTTON = Target.the("Sign in button")
            .locatedBy("form#login_form button[type='submit']");

}
