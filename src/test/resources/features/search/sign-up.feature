Feature: Registro de usuario

  Scenario: Registro exitoso
    Given que el usuario accede a la página de registro
    When completa el formulario con datos válidos
    Then debería ver la página de inicio de sesión