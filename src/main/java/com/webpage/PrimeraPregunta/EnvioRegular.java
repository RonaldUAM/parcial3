package com.webpage.PrimeraPregunta;

public class EnvioRegular implements IEnviar{
    @Override
    public void enviar(String paquete) {
        System.out.println("Se envio de forma regular el paquete "+paquete);
    }
}
