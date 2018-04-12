package uk.co.trycatchfinallysoftware.shopping.user_interface.checkout.signin;

import net.serenitybdd.screenplay.targets.Target;

public class PersonalInformation {

    // @todo REMOVE ME
    public static Target YOUR_TARGET = Target.the("")
            .locatedBy("");

    // @todo Refactor Title selection (the radio implementation is quirky)
    public static Target TITLE_MR = Target.the("")
            .locatedBy("form#account-creation_form input#id_gender1");

    public static Target TITLE_MRS = Target.the("")
            .locatedBy("form#account-creation_form input#id_gender1");

    public static Target FIRST_NAME = Target.the("")
            .locatedBy("form#account-creation_form input#customer_firstname");

    public static Target LAST_NAME = Target.the("")
            .locatedBy("form#account-creation_form input#customer_lastname");

    public static Target EMAIL = Target.the("")
            .locatedBy("form#account-creation_form #email");

    public static Target PASSWD = Target.the("")
            .locatedBy("form#account-creation_form #passwd");

    public static Target DAYS_DATE_OF_BIRTH = Target.the("")
            .locatedBy("form#account-creation_form select#days");

    public static Target MONTHS_DATE_OF_BIRTH = Target.the("")
            .locatedBy("form#account-creation_form select#months");

    public static Target YEARS_DATE_OF_BIRTH = Target.the("")
            .locatedBy("form#account-creation_form select#years");

    public static Target SIGNUP_NEWSLETTER = Target.the("")
            .locatedBy("form#account-creation_form");

    public static Target SIGNUP_SPECIAL_OFFERS = Target.the("")
            .locatedBy("form#account-creation_form");
}
