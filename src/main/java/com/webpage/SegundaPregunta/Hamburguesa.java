package com.webpage.SegundaPregunta;

public class Hamburguesa {
    private String tipoTomate;
    private String tipoCarne;
    private String tipoQueso;
    private String tipoPan;

    public Hamburguesa(Builder builder) {
        this.tipoTomate = builder.tipoTomate;
        this.tipoCarne = builder.tipoCarne;
        this.tipoQueso = builder.tipoQueso;
        this.tipoPan = builder.tipoPan;
    }

    @Override
    public String toString() {
        return "Hamburguesa{" +
                "tipoTomate='" + tipoTomate + '\'' +
                ", tipoCarne='" + tipoCarne + '\'' +
                ", tipoQueso='" + tipoQueso + '\'' +
                ", tipoPan='" + tipoPan + '\'' +
                '}';
    }

    public static class Builder extends AbstractBuilder<Hamburguesa>{
        private String tipoTomate;
        private String tipoCarne;
        private String tipoQueso;
        private String tipoPan;

        public Builder tipoTomate(String tipoTomate){
            this.tipoTomate = tipoTomate;
            return this;
        }
        public Builder tipoCarne(String tipoCarne){
            this.tipoCarne = tipoCarne;
            return this;
        }
        public Builder tipoQueso(String tipoQueso){
            this.tipoQueso = tipoQueso;
            return this;
        }
        public Builder tipoPan(String tipoPan){
            this.tipoPan = tipoPan;
            return this;
        }


        @Override
        public Hamburguesa build() {
            return new Hamburguesa(this);
        }
    }

}
