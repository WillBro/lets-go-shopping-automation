package uk.co.trycatchfinallysoftware.regres;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import uk.co.trycatchfinallysoftware.regres.steps.CreateUserSteps;

@RunWith(SerenityRunner.class)
public class CreateUserTests {

    @Steps
    CreateUserSteps createUserSteps;

    @Test
    public void verifyThatWeCanCreateANewUserWithJob() {
        String name = "John";
        String job = "Programmer";

        createUserSteps.create(name, job);
        createUserSteps.createIsExecutedSuccesfully();
        createUserSteps.iShouldFindUserIdHasBeenGenerated();
        createUserSteps.iShouldFindCreatedAt();
    }
}