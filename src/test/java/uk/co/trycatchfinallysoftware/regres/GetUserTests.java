package uk.co.trycatchfinallysoftware.regres;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import uk.co.trycatchfinallysoftware.regres.steps.CreateUserSteps;
import uk.co.trycatchfinallysoftware.regres.steps.GetUserSteps;

@RunWith(SerenityRunner.class)
public class GetUserTests {

    private int id;

    @Steps
    GetUserSteps getUserSteps;

    @Steps
    CreateUserSteps createUserSteps;

    @Before
    public void createUserToGetAndStoreId() {
        createUserSteps.create("UserToGet", "Manager");

        id = Serenity.sessionVariableCalled("id");
    }

    @Test
    public void verifyThatWeCanGetUserById() {
        getUserSteps.get(id);
        getUserSteps.getIsExecutedSuccesfully();
        getUserSteps.iShouldGetUserWithExpectedId(id);
    }
}