package com.pedro.poo;

public class UsoCuenta {
    public static void main(String[] args) {
        Cuentas cuenta1 = new Cuentas(200, "PEPE");
        Cuentas cuenta2 = new Cuentas(100,"JUAN");

        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());

        cuenta1.transferencia(cuenta2,200);

        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());


    }
}
