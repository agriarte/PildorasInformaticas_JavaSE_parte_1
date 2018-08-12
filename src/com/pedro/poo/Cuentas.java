package com.pedro.poo;

public class Cuentas {

    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;

    public Cuentas(double saldo, String nombreTitular) {
        this.saldo = saldo;
        this.nombreTitular = nombreTitular;
        this.numeroCuenta = (long) (Math.random()*10000000);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void transferencia ( Cuentas cuendaDestino, double cantidad ){
        // si saldo mayor que cantidad se puede hacer transfer
        if (this.getSaldo() >= cantidad) {
            this.setSaldo(this.getSaldo() - cantidad);
            cuendaDestino.setSaldo(cuendaDestino.getSaldo() + cantidad);
        }

    }

    @Override
    public String toString() {
        return "Cuentas{" +
                "saldo=" + saldo +
                ", nombreTitular='" + nombreTitular + '\'' +
                ", numeroCuenta=" + numeroCuenta +
                '}';
    }
}
