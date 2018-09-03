package com.pedro.temporizadorTimer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class PruebaTemporizador5 {

    public static void main(String[] args) {

        Reloj3 miReloj3 = new Reloj3();
        miReloj3.lanzarTemporizador(3000, true);
        JOptionPane.showMessageDialog(null, "Pulsa Aceptar");
    }
}

class Reloj3 {
    public void lanzarTemporizador(int intervalo, boolean sonido) {
        /*

        En este ejemplo toda la clase interna se crea de forma anónima

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

            ActionListener oyente = new DimeHora();*/

        Timer miTemporizador = new Timer(intervalo, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date ahora = new Date();
                System.out.println("Hora actual cada x segundos " + ahora);
                if (sonido) Toolkit.getDefaultToolkit().beep();
            }
        });
        miTemporizador.start();
    }
}



