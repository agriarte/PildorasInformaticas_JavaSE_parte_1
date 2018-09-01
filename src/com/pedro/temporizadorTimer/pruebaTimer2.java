package com.pedro.temporizadorTimer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

// Versión optimizada usando ActionListener() como clase anónima.
public class pruebaTimer2 {
    public static void main(String[] args) {



        //cada x milisegundos se ejecuta código de la clase anónima ActionListener();
        Timer miTimer = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date horaActual = new Date();
                System.out.println(horaActual);
            }
        });

        //inicia Timer para lanzar evento
        miTimer.start();
        //para mantenter el flujo de programa y que no llegue al final
        JOptionPane.showMessageDialog(null,"Pulsa para terminar");

    }
}
