package com.webpage.QuintaPregunta;

public class Main {
    public static void main(String[] args) {
        Computador computador = new Computador();
        Celular celular = new Celular();

        Command encenderComputador = new ComputadorOn(computador);
        Command encenderCelular = new CelularOn(celular);
        Command suspenderComputador = new ComputadorSuspender(computador);
        Command suspenderCelular = new CelularSuspender(celular);
        Command reiniciarComputador = new ComputadorReiniciar(computador);
        Command reiniciarCelular = new CelularReiniciar(celular);
        Command apagarComputador = new ComputadorApagar(computador);
        Command apagarCelular = new CelularApagar(celular);

        Ejecutar ejecutar = new Ejecutar();

        ejecutar.setCommand(encenderComputador);
        ejecutar.ejecutarCommans();

        ejecutar.setCommand(encenderCelular);
        ejecutar.ejecutarCommans();

        ejecutar.setCommand(suspenderCelular);
        ejecutar.ejecutarCommans();

        ejecutar.setCommand(suspenderComputador);
        ejecutar.ejecutarCommans();

        ejecutar.setCommand(reiniciarComputador);
        ejecutar.ejecutarCommans();

        ejecutar.setCommand(reiniciarCelular);
        ejecutar.ejecutarCommans();

        ejecutar.setCommand(apagarCelular);
        ejecutar.ejecutarCommans();

        ejecutar.setCommand(apagarComputador);
        ejecutar.ejecutarCommans();
    }
}