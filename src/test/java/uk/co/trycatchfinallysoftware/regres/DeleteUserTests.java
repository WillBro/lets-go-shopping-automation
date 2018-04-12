package uk.co.trycatchfinallysoftware.regres;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import uk.co.trycatchfinallysoftware.regres.steps.DeleteUserSteps;
import uk.co.trycatchfinallysoftware.regres.steps.GetUserSteps;

@RunWith(SerenityRunner.class)
public class DeleteUserTests {

    private int id;

    @Steps
    DeleteUserSteps deleteUserSteps;

    @Steps
    GetUserSteps getUserSteps;

    public void getSessionUserId() {
        id = Serenity.sessionVariableCalled("id");
    }

    @Test
    public void verifyThatWeCanDeleteUserById() {
        deleteUserSteps.delete(id);
        deleteUserSteps.deleteIsExecutedSuccesfully();
    }

    @Test
    public void verifyThatWeCannotGetDeletedUser() {
        getUserSteps.get(id);
        getUserSteps.getWasNotExecutedSuccessfully();
    }
}