package com.pedro.temporizadorTimer;

import javax.swing.*;
import java.awt.event.ActionListener;


public class pruebaTemporizador3 {
    public static void main(String[] args) {

        Reloj miReloj = new Reloj(5000,true);
        miReloj.lanzarTemporizador();

    }
}

class Reloj{
    private int intervalo;
    private boolean sonido;

    public Reloj(int intervalo, boolean sonido) {
        this.intervalo = intervalo;
        this.sonido = sonido;
    }

    public void lanzarTemporizador{
        ActionListener oyente = new DimeHora();
        Timer miTemporizador = new Timer(intervalo,oyente);
        miTemporizador.start();


    }
}