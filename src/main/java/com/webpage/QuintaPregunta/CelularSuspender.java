package com.webpage.QuintaPregunta;

public class CelularSuspender implements Command{
    private Celular celular;

    public CelularSuspender(Celular celular) {
        this.celular = celular;
    }

    @Override
    public void execute() {
        celular.suspender();
    }
}
