package starter.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import starter.ui.SignUpPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillSignUpForm {
    public static Task withValidData() {
        return instrumented(FillFormTask.class);
    }

    public static class FillFormTask implements Task {
        public <T extends net.serenitybdd.screenplay.Actor> void performAs(T actor) {
            actor.attemptsTo(
                Enter.theValue("Laura").into(SignUpPage.NOMBRE),
                Enter.theValue("Ramírez").into(SignUpPage.APELLIDO),
                Enter.theValue("laura@mail.com").into(SignUpPage.EMAIL),
                Enter.theValue("Laura1234").into(SignUpPage.PASSWORD),
                Click.on(SignUpPage.BOTON_REGISTRAR)
            );
        }
    }
}
