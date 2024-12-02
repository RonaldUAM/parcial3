package com.webpage.QuintaPregunta;

public class ComputadorOn implements Command{
    private Computador computador;

    public ComputadorOn(Computador computador) {
        this.computador = computador;
    }

    @Override
    public void execute() {
        computador.encender();
    }
}
