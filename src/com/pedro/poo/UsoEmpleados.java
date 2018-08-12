package com.pedro.poo;

public class UsoEmpleados {
    public static void main(String[] args) {

        Empleados empleado1 = new Empleados("Ana");
        System.out.println(empleado1.getDatosEmpleados());

        empleado1.setSeccion("Ventas");
        System.out.println(empleado1.getDatosEmpleados());

        Empleados empleado2 = new Empleados("Jorge");

        Empleados empleado3 = new Empleados("Martina");

        System.out.println(empleado2.getDatosEmpleados());
        System.out.println(empleado3.getDatosEmpleados());

        System.out.println("El siguiente Id será " + Empleados.getId_siguiente());
    }
}
class Empleados {
    private final String nombre;
    private String seccion;
    private int id;
    private static int id_siguiente=1;// variable de clase, no pertenece a ninguna instancia.

    public Empleados(String nombre) {
        this.nombre = nombre;
        this.seccion = "Administración";
        this.id = id_siguiente;
        id_siguiente++;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getDatosEmpleados (){
        return "El empleado " + nombre + " pertenece a la sección " + seccion + " y tiene Id: " + id;
    }

    //método estático accesible sin instanciar
    public static int getId_siguiente(){
        return id_siguiente;
    }
}