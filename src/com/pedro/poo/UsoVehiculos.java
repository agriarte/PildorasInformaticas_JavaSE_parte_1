package com.pedro.poo;

public class UsoVehiculos {
    public static void main(String[] args) {

        Vehiculos vehiculo1 = new Vehiculos(4,"amarillo",4,2,2000);
        Vehiculos vehiculo2 = new Vehiculos(2,"gris",2,1,300);

        System.out.println(vehiculo1.toString());
        System.out.println(vehiculo2.toString());

    }
}
