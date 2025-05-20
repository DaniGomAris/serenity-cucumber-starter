package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpPage {
    public static final Target NOMBRE = Target.the("Nombre").located(By.id("nombre"));
    public static final Target APELLIDO = Target.the("Apellido").located(By.id("apellido"));
    public static final Target EMAIL = Target.the("Email").located(By.id("email"));
    public static final Target PASSWORD = Target.the("Contraseña").located(By.id("password"));
    public static final Target BOTON_REGISTRAR = Target.the("Botón Crear Cuenta").located(By.id("btnRegister"));
}
