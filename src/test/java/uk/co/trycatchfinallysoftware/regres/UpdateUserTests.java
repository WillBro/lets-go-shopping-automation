package uk.co.trycatchfinallysoftware.regres;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import uk.co.trycatchfinallysoftware.regres.steps.UpdateUserSteps;

@RunWith(SerenityRunner.class)
public class UpdateUserTests {

    private int id;

    @Steps
    UpdateUserSteps updateUserSteps;

    @Before
    public void getSessionUserId() {
        id = Serenity.sessionVariableCalled("id");
    }

    @Test
    public void verifyThatWeCanUpdateUserByIdWithNewNameAndJob() {
        String newName = "Tony";
        String newJob = "Tank Engine";

        updateUserSteps.update(id, newName, newJob);
        updateUserSteps.updateIsExecutedSuccesfully();
    }
}