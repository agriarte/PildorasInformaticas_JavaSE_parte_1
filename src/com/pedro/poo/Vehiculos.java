package com.pedro.poo;

public class Vehiculos {
    private int ruedas;
    private String color;
    private int largo;
    private int ancho;
    private int peso;

    public Vehiculos(int ruedas, String color, int largo, int ancho, int peso) {
        this.ruedas = ruedas;
        this.color = color;
        this.largo = largo;
        this.ancho = ancho;
        this.peso = peso;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Vehiculos{" +
                "ruedas=" + ruedas +
                ", color='" + color + '\'' +
                ", largo=" + largo +
                ", ancho=" + ancho +
                ", peso=" + peso +
                '}';
    }
}
