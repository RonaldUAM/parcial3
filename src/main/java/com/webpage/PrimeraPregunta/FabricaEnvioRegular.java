package com.webpage.PrimeraPregunta;

public class FabricaEnvioRegular implements InterfazFabrica{
    @Override
    public IEnviar crearEnvio() {
        return new EnvioRegular();
    }
}
