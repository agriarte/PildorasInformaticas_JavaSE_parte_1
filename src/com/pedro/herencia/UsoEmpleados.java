package com.pedro.herencia;

import java.util.GregorianCalendar;

public class UsoEmpleados {
    public static void main(String[] args) {

        /*Empleados antonio = new Empleados("Antonio",2000,1998,5,22);
        Jefes ana = new Jefes("Ana",2900,2002,5,3);
        ana.setIncentivo(300);
        System.out.println("Ana: " + ana.getSueldo() );*/

        Jefes juan = new Jefes("Juan", 8000, 1990, 5, 22);
        juan.setIncentivo(200);

        Empleados[] losEmpleados = new Empleados[6];
        losEmpleados[0] = new Empleados("Antonio", 2000, 1998, 5, 22);
        losEmpleados[1] = new Empleados("Carlos", 3000, 2001, 6, 7);
        losEmpleados[2] = new Empleados("Maria", 4000, 2002, 7, 23);
        losEmpleados[3] = new Empleados("Ana", 5000, 2003, 8, 5);

        losEmpleados[4] = juan;// objeto Juan jefe dentro array empleados solo recoge metodos de Empleado

        // pero si lo hacemos asi:
        Jefes juan2 = (Jefes) losEmpleados[4];//ahora juan2 es un objeto Jefe completo





        for (Empleados elem : losEmpleados) {
            System.out.println(elem.getDatosEmpleados() + " y un salario de: " + elem.getSueldo());
        }
    }
}

class Empleados {
    private final String nombre;
    private int id;
    private double sueldo;
    GregorianCalendar calendario;

    private static int id_siguiente = 1;// variable de clase, no pertenece a ninguna instancia.

    public Empleados(String nombre, double sueldo, int agno, int mes, int dia) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        calendario = new GregorianCalendar(agno, mes, dia);
        this.id = id_siguiente;
        id_siguiente++;
    }

    public void setSubeSueldo(double porcentaje) {
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }

    public String getDatosEmpleados() {
        return "El empleado " + nombre + " y tiene Id: " + id;
    }

    public GregorianCalendar getCalendario() {
        return calendario;
    }

    public double getSueldo() {

        return sueldo;
    }

    //método estático accesible sin instanciar
    public static int getId_siguiente() {
        return id_siguiente;
    }
}

class Jefes extends Empleados {

    private double incentivo;

    public Jefes(String nombre, double sueldo, int agno, int mes, int dia) {
        super(nombre, sueldo, agno, mes, dia);
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    public double getSueldo() {
        double sueldoJefe = super.getSueldo() + incentivo;
        return sueldoJefe;
    }
}
