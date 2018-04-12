package uk.co.trycatchfinallysoftware.regres;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import uk.co.trycatchfinallysoftware.regres.steps.CreateUserSteps;
import uk.co.trycatchfinallysoftware.regres.steps.DeleteUserSteps;
import uk.co.trycatchfinallysoftware.regres.steps.GetUserSteps;

@RunWith(SerenityRunner.class)
public class DeleteUserTests {

    private int id;

    @Steps
    DeleteUserSteps deleteUserSteps;

    @Steps
    CreateUserSteps createUserSteps;

    @Steps
    GetUserSteps getUserSteps;

    @Before
    public void getSessionUserId() {
        createUserSteps.create("UserToDelete", "Refuse Collector");

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