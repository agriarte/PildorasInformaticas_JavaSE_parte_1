package com.pedro.ejercicioInterfaces65;

public interface Vehiculos {
    final int VELOCIDAD_MAXIMA=120;
    public abstract void Acelerar(int v);
    public abstract void Frenar(int v);
    public abstract int Plazas();
}
