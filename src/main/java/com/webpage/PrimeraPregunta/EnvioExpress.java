package com.webpage.PrimeraPregunta;

public class EnvioExpress implements IEnviar{
    @Override
    public void enviar(String paquete) {
        System.out.println("Se envio de forma express el paquete "+paquete);
    }
}
