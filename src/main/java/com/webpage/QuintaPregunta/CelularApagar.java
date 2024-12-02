package com.webpage.QuintaPregunta;

public class CelularApagar implements Command{
    private Celular celular;

    public CelularApagar(Celular celular) {
        this.celular = celular;
    }

    @Override
    public void execute() {
        celular.apagar();
    }
}
