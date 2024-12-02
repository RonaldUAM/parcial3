package com.webpage.QuintaPregunta;

public class CelularReiniciar implements Command{
    private Celular celular;

    public CelularReiniciar(Celular celular) {
        this.celular = celular;
    }

    @Override
    public void execute() {
        celular.reiniciar();
    }
}
