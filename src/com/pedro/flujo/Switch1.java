package com.pedro.flujo;

import javax.swing.*;

public class Switch1 {
    public static void main(String[] args) {
        int hijos = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero de hijos: "));

        switch (hijos) {
            case 0:
                System.out.println("natalidad baja");
                break;
            case 1:
                System.out.println("por algo se empieza");
                break;
            case 2:
                System.out.println("parejita");
                break;
            case 3:
                System.out.println("familia numerosa");
                break;
            default:
                System.out.println("no tienes limite ;-)");
        }
    }
}
