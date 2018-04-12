package uk.co.trycatchfinallysoftware.shopping.tasks.checkout;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import uk.co.trycatchfinallysoftware.shopping.user_interface.checkout.signin.YourAddress;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * @todo Implementing remaining (non-optional) input field properties
 */
public class FillAddressDetails implements Task {

    private final String addressLineOne;
    private final String country;
    private final String city;
    private final String state;
    private final String postcode;
    private final String mobilePhone;
    private final String alias;

    @Override
    public <T extends Actor> void performAs(T actor) {

        // @todo Wire the remaining input fields
        actor.attemptsTo(
                Enter.theValue(addressLineOne).into(YourAddress.ADDRESS_LINE_ONE),
                SelectFromOptions.byVisibleText(country).from(YourAddress.COUNTRY),
                Enter.theValue(city).into(YourAddress.CITY),
                SelectFromOptions.byVisibleText(state).from(YourAddress.STATE),
                Enter.theValue(postcode).into(YourAddress.POSTCODE),
                Enter.theValue(mobilePhone).into(YourAddress.MOBILE_PHONE),
                Enter.theValue(alias).into(YourAddress.ALIAS)
        );
    }

    public static FillAddressDetails withAddress(
            String addressLineOne,
            String city,
            String state,
            String postcode,
            String country,
            String mobilePhone,
            String alias
    ) {
        return instrumented(FillAddressDetails.class,
                addressLineOne,
                city,
                state,
                postcode,
                country,
                mobilePhone,
                alias
        );
    }

    public FillAddressDetails(
            String addressLineOne,
            String city,
            String state,
            String postcode,
            String country,
            String mobilePhone,
            String alias
    ) {
        this.addressLineOne = addressLineOne;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
        this.country = country;
        this.mobilePhone = mobilePhone;
        this.alias = alias;
    }
}
