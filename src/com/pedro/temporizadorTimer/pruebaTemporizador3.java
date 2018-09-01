package com.pedro.temporizadorTimer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


public class pruebaTemporizador3 {
    public static void main(String[] args) {

        Reloj miReloj = new Reloj(3000, true);
        miReloj.lanzarTemporizador();
        JOptionPane.showMessageDialog(null, "Pulsa Aceptar");

    }
}

class Reloj {
    private int intervalo;
    private boolean sonido;

    public Reloj(int intervalo, boolean sonido) {
        this.intervalo = intervalo;
        this.sonido = sonido;
    }

    public void lanzarTemporizador() {
        ActionListener oyente = new DimeHora();
        Timer miTemporizador = new Timer(intervalo, oyente);
        miTemporizador.start();
    }

    private class DimeHora implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Date ahora = new Date();
            System.out.println("Hora actual cada x segundos " + ahora  );

            if (sonido) Toolkit.getDefaultToolkit().beep();
        }
    }
}