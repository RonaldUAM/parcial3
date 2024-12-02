package com.webpage.SegundaPregunta;

public class Main {
    public static void main(String[] args) {
        Hamburguesa hamburguesa = new Hamburguesa.Builder()
                .tipoTomate("Cherry")
                .tipoCarne("Res")
                .tipoPan("Integral")
                .tipoQueso("Chedar")
                .build();

        System.out.println("--------Segunda Pregunta - Patron builder-------");
        System.out.println("Hamburguesa creada");
        System.out.println(hamburguesa.toString());
    }
}