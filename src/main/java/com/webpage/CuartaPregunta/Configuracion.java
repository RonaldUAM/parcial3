package com.webpage.CuartaPregunta;

public class Configuracion {
    private static Configuracion instance;

    private String url;
    private String usuario;
    private String password;

    private Configuracion() {
        this.url = "wwww";
        this.usuario = "user";
        this.password = "password";
    }

    public static Configuracion getInstance(){
        if (instance == null){
            instance = new Configuracion();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Configuracion{" +
                "url='" + url + '\'' +
                ", usuario='" + usuario + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
