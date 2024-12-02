package com.webpage.PrimeraPregunta;

public class FabricaExpress implements InterfazFabrica{
    @Override
    public IEnviar crearEnvio() {
        return new EnvioExpress();
    }
}
