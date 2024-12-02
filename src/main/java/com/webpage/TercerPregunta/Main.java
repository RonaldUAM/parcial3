package com.webpage.TercerPregunta;

public class Main {
    public static void main(String[] args) {
        NuevoSistemaPago sistemaPago = new NuevoSistemaPago("p","1","asas@gmail.com");

        SistemaDePago sistemaDePago = new SistemaDePago();
        SistemaDeNotificacion sistemaDeNotificacion = new SistemaDeNotificacion(sistemaPago);


        AdapterSistemaDepago adapterSistemaDepago = new AdapterSistemaDepago(sistemaDePago,sistemaDeNotificacion);
        adapterSistemaDepago.procesarPago();
        adapterSistemaDepago.ejecutarNotificacion();
    }
}