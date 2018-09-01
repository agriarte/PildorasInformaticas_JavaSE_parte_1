package com.pedro.ejercicioInterfaces65;

public class Coche implements Vehiculos {
    private int velocidad;

    public Coche(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public void Acelerar(int v) {
        if (velocidad > VELOCIDAD_MAXIMA) {
            System.out.println("Alerta Velocidad Alta");
            ;
        }
        velocidad += v;
        System.out.println(velocidad);
    }

    @Override
    public void Frenar(int v) {
        if (velocidad-v >= 0) {
            velocidad -= v;
        } else {
            velocidad = 0;
        }
        System.out.println(velocidad);
    }

    @Override
    public int Plazas() {
        //capacidad 2 motos, 5 coches
        return 5;
    }
}
