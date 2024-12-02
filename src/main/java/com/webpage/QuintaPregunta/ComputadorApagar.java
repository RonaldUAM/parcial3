package com.webpage.QuintaPregunta;

public class ComputadorApagar implements Command{
    private Computador computador;

    public ComputadorApagar(Computador computador) {
        this.computador = computador;
    }

    @Override
    public void execute() {
        computador.apagar();
    }
}
