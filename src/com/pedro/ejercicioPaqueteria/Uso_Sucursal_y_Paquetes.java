package com.pedro.ejercicioPaqueteria;

import java.util.Scanner;

public class Uso_Sucursal_y_Paquetes {
    public static void main(String[] args) {
        //datos sucursal

        int num_sucursal;
        String direccion;
        String ciudad;
        int num_paquetes;

        //datos cada paquete

        int referencia_paquete;
        String DNI;
        double peso;
        short prioridad_envio;

        Scanner entrada = new Scanner(System.in);

        System.out.println("ENTRADA DE DATOS");

        System.out.print("Num. Sucursal: ");
        num_sucursal = entrada.nextInt();

        //se duplica .nextLine para que capture el salto de línea de la entrada
        //de edad y así pille el nombre
        entrada.nextLine();
        System.out.print("Dirección: ");
        direccion = entrada.nextLine();

        System.out.print("Ciudad: ");
        ciudad = entrada.nextLine();

        System.out.print("Num. Paquetes: ");
        num_paquetes = entrada.nextInt();

        //creamos objeto sucursal con los datos entrados
        Sucursal sucursal = new Sucursal(num_sucursal, direccion, ciudad);
        //array de paquetes
        Paquete array_paquetes[] = new Paquete[num_paquetes];

        //entrada de datos para cada paquete
        System.out.println("ENTRADA DATOS PARA " + (num_paquetes+1) + " paquete/s");
        for (int i = 0; i < num_paquetes; i++) {

            //se duplica .nextLine para que capture el salto de línea
            System.out.println("Datos paquete nº: " + i);

            System.out.print("Referencia paquete: ");
            referencia_paquete = entrada.nextInt();

            System.out.print("Peso del paquete: ");
            peso = entrada.nextDouble();

            entrada.nextLine();
            System.out.print("DNI: ");
            DNI = entrada.nextLine();

            System.out.print("Prioridad: ");
            prioridad_envio = entrada.nextShort();


            array_paquetes[i] = new Paquete(referencia_paquete, peso, DNI, prioridad_envio);
        }


        //imprimir datos sucursal
        System.out.println("DATOS SUCURSAL");
        System.out.println("Número de sucursal: " + num_sucursal);
        System.out.println("Dirección " + direccion);
        System.out.println("Ciudad "+ ciudad);
        System.out.println("Numero de paquetes" + num_paquetes);

        System.out.println("DATOS PAQUETES");

        for (int i = 0; i < num_paquetes; i++) {
            System.out.println("Paquete " + (i+1));
            System.out.println("Referencia: " + array_paquetes[i].getReferencia());
            System.out.println("Peso: " + array_paquetes[i].getPeso());
            System.out.println("Prioridad: " + array_paquetes[i].getPrioridad());
            double precio = sucursal.setPrecio(array_paquetes[i]);
            System.out.println("Precio envio: " + precio);
        }

    }
}
