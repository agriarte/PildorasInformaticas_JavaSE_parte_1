package com.pedro.flujo;

import javax.swing.*;

public class OperadorTernario {
    public static void main(String[] args) {
        double salario1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce 1º salario: "));

        double salario2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce 2º salario: "));

        double salario_mayor;

        /*if (salario1>salario2) salario_mayor = salario1;

        else salario_mayor = salario2; */
        salario_mayor = (salario1>salario2)? salario1 : salario2;

        System.out.println("Salario mayor es " + salario_mayor);

        ////// otro ejemplo de ternario
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad: "));
        String respuesta = (edad>18)? "Mayor de edad":"Menor de edad";
        System.out.println(respuesta);
    }
}
