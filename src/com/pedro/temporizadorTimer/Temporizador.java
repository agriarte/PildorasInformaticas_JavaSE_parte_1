package com.pedro.temporizadorTimer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Temporizador implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        //cada vez que se cumple el evento del tiempo se ejecuta la acción
        Date horaActual = new Date();
        System.out.println(horaActual);
    }
}
