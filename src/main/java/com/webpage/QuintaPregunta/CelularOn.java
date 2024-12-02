package com.webpage.QuintaPregunta;

public class CelularOn implements Command{
    private Celular celular;

    public CelularOn(Celular celular) {
        this.celular = celular;
    }

    @Override
    public void execute() {
        celular.encender();
    }
}
