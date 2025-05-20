package starter.stepdefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actions.Open;
import starter.tasks.FillSignUpForm;

public class SignUpStepDefinitions {

    @Given("que el usuario accede a la página de registro")
    public void accederAPaginaRegistro() {
        OnStage.theActorCalled("Tester").attemptsTo(
            Open.url("http://localhost:4200/sign-up")
        );
    }

    @When("completa el formulario con datos válidos")
    public void completarFormulario() {
        OnStage.theActorInTheSpotlight().attemptsTo(
            FillSignUpForm.withValidData()
        );
    }

    @Then("debería ver la página de inicio de sesión")
    public void verificarRedireccion() {
        // Aquí puedes hacer una validación real si tu app muestra algo al redirigir
    }
}
