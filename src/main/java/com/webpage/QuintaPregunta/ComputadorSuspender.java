package com.webpage.QuintaPregunta;

public class ComputadorSuspender implements Command{
    private Computador computador;

    public ComputadorSuspender(Computador computador) {
        this.computador = computador;
    }

    @Override
    public void execute() {
        computador.suspender();
    }
}
