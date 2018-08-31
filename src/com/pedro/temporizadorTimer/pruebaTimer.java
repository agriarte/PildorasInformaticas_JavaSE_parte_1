package com.pedro.temporizadorTimer;

import javax.swing.*;

public class pruebaTimer {
    public static void main(String[] args) {

        //se crea objeto Temporizador con constructor por defecto
        Temporizador oyente = new Temporizador();

        //cada x milisegundos se llama la clase oyente;
        Timer miTimer = new Timer(5000, oyente );
        //inicia Timer para lanzar evento
        miTimer.start();
        //para mantenter el flujo de programa y que no llegue al final
        JOptionPane.showMessageDialog(null,"Pulsa para terminar");

    }
}
