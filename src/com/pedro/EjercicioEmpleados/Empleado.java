package com.pedro.EjercicioEmpleados;

public abstract class Empleado {


    private String nombre;
    private String apellidos;
    private String dni;
    private int anyo;

    public Empleado(String nombre, String apellidos, String dni, int anyo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.anyo = anyo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }


    public String imprimir() {
        return "un empleado con nombre " + nombre +
                " apellidos " + apellidos +
                " dni " + dni +
                " año " + anyo ;
    }

    public abstract double getSalario();
}
