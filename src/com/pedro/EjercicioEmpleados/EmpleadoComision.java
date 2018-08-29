package com.pedro.EjercicioEmpleados;

public class EmpleadoComision extends Empleado {
    private int clientes;
    private double puntos;
    private double fijo;

    public EmpleadoComision(String nombre, String apellidos, String dni, int año, int clientes, double puntos) {
        super(nombre, apellidos, dni, año);
        this.clientes = clientes;
        this.puntos = puntos;
        this.fijo = 950;
    }

    public EmpleadoComision(String nombre, String apellidos, String dni, int anyo) {
        super(nombre, apellidos, dni, anyo);
        this.fijo = 950;
    }

    @Override
    public double getSalario() {
        return fijo + (clientes*puntos);
    }

    public int getClientes() {
        return clientes;
    }

    public void setClientes(int clientes) {
        this.clientes = clientes;
    }

    public double getPuntos() {
        return puntos;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }

    public String imprimir() {
        return "un empleado a comision con nombre " + this.getNombre() +
                " apellidos " + this.getApellidos() +
                " dni " + this.getDni() +
                " año " + this.getAnyo() +
                " num clientes " + clientes +
                " sueldo " + this.getSalario();
    }
}
