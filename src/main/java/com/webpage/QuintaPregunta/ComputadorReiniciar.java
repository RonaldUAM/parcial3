package com.webpage.QuintaPregunta;

public class ComputadorReiniciar implements Command{
    private Computador computador;

    public ComputadorReiniciar(Computador computador) {
        this.computador = computador;
    }

    @Override
    public void execute() {
        computador.reiniciar();
    }
}
