package com.pedro.temporizadorTimer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class PruebaTemporizador4 {
    public static void main(String[] args) {

        Reloj2 miReloj2 = new Reloj2();
        miReloj2.lanzarTemporizador(3000, true);
        JOptionPane.showMessageDialog(null, "Pulsa Aceptar");
    }
}

class Reloj2 {
    public void lanzarTemporizador(int intervalo, boolean sonido) {


        // CLASE INTERNA
        class DimeHora implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date ahora = new Date();
                System.out.println("Hora actual cada x segundos " + ahora);

                if (sonido) Toolkit.getDefaultToolkit().beep();
            }
        }
        // ------------

        ActionListener oyente = new DimeHora();
        Timer miTemporizador = new Timer(intervalo, oyente);
        miTemporizador.start();
    }


}




