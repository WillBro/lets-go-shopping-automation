package uk.co.trycatchfinallysoftware.shopping.tasks.checkout;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import uk.co.trycatchfinallysoftware.shopping.user_interface.checkout.signin.PersonalInformation;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillPersonalDetails implements Task {

    private final String title;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
    private final int dayOfBirth;
    private final int monthOfBirth;
    private final int yearOfBirth;
    private final boolean signupNewsletter;
    private final boolean specialOffers;

    @Override
    public <T extends Actor> void performAs(T actor) {

        // @todo Wire the remaining input fields
        actor.attemptsTo(
                Enter.theValue(firstName).into(PersonalInformation.FIRST_NAME),
                Enter.theValue(lastName).into(PersonalInformation.LAST_NAME),
                Enter.theValue(email).into(PersonalInformation.EMAIL),
                Enter.theValue(password).into(PersonalInformation.PASSWD)
        );
    }

    public static FillPersonalDetails withDetails(
            String title,
            String firstName,
            String lastName,
            String email,
            String password,
            int dayOfBirth,
            int monthOfBirth,
            int yearOfBirth,
            boolean signupNewsletter,
            boolean specialOffers
    ) {
        return instrumented(FillPersonalDetails.class,
                title,
                firstName,
                lastName,
                email,
                password,
                dayOfBirth,
                monthOfBirth,
                yearOfBirth,
                signupNewsletter,
                specialOffers
        );
    }

    public FillPersonalDetails(
            String title,
            String firstName,
            String lastName,
            String email,
            String password,
            int dayOfBirth,
            int monthOfBirth,
            int yearOfBirth,
            boolean signupNewsletter,
            boolean specialOffers
    ) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.signupNewsletter = signupNewsletter;
        this.specialOffers = specialOffers;
    }
}
