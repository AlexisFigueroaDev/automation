Feature: prueba google

    Scenario: Como usuario entro un criterio de busqueda en Google
        Given entro al buscador de google
        When entro un criterio de busqueda
        And hago click en el boton buscar
        Then validar busqueda