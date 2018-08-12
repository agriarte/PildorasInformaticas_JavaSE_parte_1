package com.pedro.ejercicioPaqueteria;

public class Paquete {

    private int referencia;
    private double peso;
    private String DNI;
    private short prioridad;

    public Paquete(int referencia, double peso, String DNI, short prioridad) {
        this.referencia = referencia;
        this.peso = peso;
        this.DNI = DNI;
        this.prioridad = prioridad;
    }

    public double getPeso() {
        return peso;
    }

    public short getPrioridad() {
        return prioridad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPrioridad(short prioridad) {
        this.prioridad = prioridad;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Paquete{" +
                "referencia=" + referencia +
                ", peso=" + peso +
                ", DNI='" + DNI + '\'' +
                ", prioridad=" + prioridad +
                '}';
    }
}
