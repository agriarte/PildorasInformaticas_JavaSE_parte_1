package com.pedro.entradas;

import java.util.Scanner;

public class ScannerMixto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = entrada.nextInt();

        System.out.println("Introduce tu nombre: ");
        //se duplica .nextLine para que capture el salto de línea de la entrada
        //de edad y así pille el nombre
        entrada.nextLine();
        String nombre = entrada.nextLine();

        System.out.println("Te llamas " + nombre + " y  tienes " + edad + " años");

        entrada.close();
    }
}
