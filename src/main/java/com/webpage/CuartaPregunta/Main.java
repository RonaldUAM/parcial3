package com.webpage.CuartaPregunta;

public class Main {
    public static void main(String[] args) {
        Configuracion configuracion = Configuracion.getInstance();
        Configuracion configuracion2 = Configuracion.getInstance();

        System.out.println(configuracion.toString());
        System.out.println(configuracion2.toString());
        System.out.println("Son las mismas? "+(configuracion==configuracion2));

    }
}