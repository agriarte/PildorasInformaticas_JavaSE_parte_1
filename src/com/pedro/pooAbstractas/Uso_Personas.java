package com.pedro.pooAbstractas;

import java.util.Date;

public class Uso_Personas {
    public static void main(String[] args) {
        Empleados Juan = new Empleados("Juan",new Date(34534534),2500);
        System.out.println(Juan.getNombre());
        System.out.println(Juan.getDescripcion());

        Jefes Ana = new Jefes("Ana", new Date(871238721),3500);
        System.out.println(Ana.getNombre());
        System.out.println(Ana.getDescripcion());

        Alumnos Maria = new Alumnos("Maria", "Dibujo", "Aula 6");
        System.out.println(Maria.getNombre());
        System.out.println(Maria.getDescripcion());

        Jefes Perico = new Jefes("Perico",new Date (242342),4444);
        System.out.println("El jefe " + Perico.getNombre() + " tiene un bonus de " +
        Perico.setBonus(400));
    }
}
