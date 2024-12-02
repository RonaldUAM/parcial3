package com.webpage.TercerPregunta;

public class AdapterSistemaDepago implements SistemaPago,SistemaNotificacion{
    private final SistemaDePago sistemaPago;
    private final SistemaDeNotificacion sistemaNotificacion;

    public AdapterSistemaDepago(SistemaDePago sistemaPago, SistemaDeNotificacion sistemaNotificacion) {
        this.sistemaPago = sistemaPago;
        this.sistemaNotificacion = sistemaNotificacion;
    }

    @Override
    public void procesarPago() {
        sistemaPago.validarAutorizacion();
        sistemaPago.realizarPago();
    }

    @Override
    public void ejecutarNotificacion() {
        sistemaNotificacion.validarCorreo();
        sistemaNotificacion.crearSesion();
    }
}
