package com.pedro.ejercicioCuentaCorriente;

public class main {
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente("pedro", 1000);
        CuentaCorriente cuenta2 = new CuentaCorriente("ivan", 0);
        System.out.println(cuenta1.getDatosCuenta());
        System.out.println(cuenta2.getDatosCuenta());
        cuenta2.transferencia(cuenta1, 100);

        cuenta1.transferencia(cuenta2, 500);

        System.out.println(cuenta1.getDatosCuenta());
        System.out.println(cuenta2.getDatosCuenta());

    }
}
