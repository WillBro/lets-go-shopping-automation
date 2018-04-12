package uk.co.trycatchfinallysoftware.shopping.user_interface.checkout.signin;

import net.serenitybdd.screenplay.targets.Target;

public class PersonalInformation {

    // @todo Refactor Title selection (the radio implementation is quirky)
    public static Target TITLE_MR = Target.the("Choose Mr title")
            .locatedBy("form#account-creation_form input#id_gender1");

    public static Target TITLE_MRS = Target.the("Choose Mrs title")
            .locatedBy("form#account-creation_form input#id_gender1");

    public static Target FIRST_NAME = Target.the("Fill in firstname")
            .locatedBy("form#account-creation_form input#customer_firstname");

    public static Target LAST_NAME = Target.the("Fill in lastname")
            .locatedBy("form#account-creation_form input#customer_lastname");

    public static Target EMAIL = Target.the("Enter email address")
            .locatedBy("form#account-creation_form #email");

    public static Target PASSWD = Target.the("Enter password")
            .locatedBy("form#account-creation_form #passwd");

    public static Target DAYS_DATE_OF_BIRTH = Target.the("Choose date of birth - Day")
            .locatedBy("form#account-creation_form select#days");

    public static Target MONTHS_DATE_OF_BIRTH = Target.the("Choose date of birth - Month")
            .locatedBy("form#account-creation_form select#months");

    public static Target YEARS_DATE_OF_BIRTH = Target.the("Choose date of birth - Years")
            .locatedBy("form#account-creation_form select#years");

    public static Target SIGNUP_NEWSLETTER = Target.the("Choose Newsletter Signup")
            .locatedBy("form#account-creation_form label[for='newsletter']");

    public static Target SIGNUP_SPECIAL_OFFERS = Target.the("Choose Special Offer Signup")
            .locatedBy("form#account-creation_form label[for='optin']");
}
