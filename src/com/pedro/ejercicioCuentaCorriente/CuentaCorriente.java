package com.pedro.ejercicioCuentaCorriente;

public class CuentaCorriente {
    private String titular;
    private double saldo;
    private long num_cuenta;

    public CuentaCorriente(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        this.num_cuenta = (long) (Math.random() * 100000);
    }


    public void transferencia(CuentaCorriente cuentaDestino, double cantidad) {
        if (saldo > cantidad) {
            saldo = saldo - cantidad;
            cuentaDestino.ingresar(cantidad);
        } else {
            System.out.println("no hay saldo para transferir esa cantidad");
        }

    }

    public double getSaldo() {
        return saldo;
    }

    public void retirar(double cantidad) {
        if (saldo > cantidad) {
            saldo = saldo - cantidad;
        } else {
            System.out.println("no hay saldo para retirar esa cantidad");
        }
    }

    public void ingresar(double cantidad) {
        saldo = saldo + cantidad;
    }

    public String getDatosCuenta() {
        return "CuentaCorriente{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", num_cuenta=" + num_cuenta +
                '}';
    }

}
