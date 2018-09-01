package com.pedro.ejercicioInterfaces65;

public class Main {
    public static void main(String[] args) {
        Vehiculos[] misVehiculos = new Vehiculos[4];
        misVehiculos[0] = new Coche(130);
        misVehiculos[1] = new Coche(80);
        misVehiculos[2] = new Moto(20);
        misVehiculos[3] = new Moto(66);

        for (int j = 0; j < 10 ; j++) {
            for (int i = 0; i < misVehiculos.length; i++) {
                System.out.println(misVehiculos[i].Plazas());
                misVehiculos[i].Acelerar(20);
            }
        }
        for (int j = 0; j < 20 ; j++) {
            for (int i = 0; i < misVehiculos.length; i++) {
                System.out.println(misVehiculos[i].Plazas());
                misVehiculos[i].Frenar(20);
            }
        }

    }
}
