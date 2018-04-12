package uk.co.trycatchfinallysoftware.regres;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import uk.co.trycatchfinallysoftware.regres.steps.GetUserSteps;

@RunWith(SerenityRunner.class)
public class GetUserTests {

    @Steps
    GetUserSteps getUserSteps;

    @Test
    public void verifyThatWeCanGetUserById() {
        int id = Serenity.sessionVariableCalled("id");

        getUserSteps.get(id);
        getUserSteps.getIsExecutedSuccesfully();
        getUserSteps.iShouldGetUserWithExpectedId(id);
    }
}