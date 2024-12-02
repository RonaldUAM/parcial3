package com.webpage.TercerPregunta;

public class SistemaDeNotificacion {
    private NuevoSistemaPago sistemaPago;

    public SistemaDeNotificacion(NuevoSistemaPago sistemaPago) {
        this.sistemaPago = sistemaPago;
    }

    public void crearSesion(){
        System.out.println("CREANDO LA SESION A: "+sistemaPago.getNombre());
    }

    public void validarCorreo(){
        System.out.println("VALIDANDO EL CORREO: "+sistemaPago.getCorreo());
    }
}
