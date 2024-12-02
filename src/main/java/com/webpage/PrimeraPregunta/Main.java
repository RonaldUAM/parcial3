package com.webpage.PrimeraPregunta;

public class Main {
    public static void main(String[] args) {
        InterfazFabrica fabrica = new FabricaEnvioRegular();
        IEnviar envioRegular = fabrica.crearEnvio();

        envioRegular.enviar("Celular");

        InterfazFabrica fabrica1 = new FabricaExpress();
        IEnviar envioExpress = fabrica1.crearEnvio();

        envioExpress.enviar("Celular");

    }
}