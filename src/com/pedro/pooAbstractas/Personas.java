package com.pedro.pooAbstractas;

import java.util.Date;

public abstract class Personas {
    private String nombre;

    public Personas(String nom){
        nombre=nom;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract String getDescripcion();


}

class Empleados extends Personas implements ParaTrabajadores {

    private double sueldo;

    private Date fechaAlta;

    public Empleados(String nom, Date fechaAlta, double sueldo) {
        super(nom);
        this.fechaAlta=fechaAlta;
        this.sueldo=sueldo;
    }

    @Override
    public String getDescripcion() {
        return "El empleado " + this.getNombre() + " tiene un sueldo de " + sueldo + "€ y entró a trabajar en " +
                fechaAlta;
    }

    @Override
    public double setBonus(double gratificacion) {
        return ParaTrabajadores.bonus + gratificacion;
    }
}

class Jefes extends Empleados implements ParaJefes {
    private double incentivo;
    private String cargo;
    public Jefes(String nom, Date fechaAlta, double sueldo) {
        super(nom, fechaAlta, sueldo);
    }

    private void setIncentivo (double incentivo){
        this.incentivo=incentivo;
    }

    @Override
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String getCargo() {
        return "\nademás tiene el cargo de " + cargo;
    }

    @Override
    public double setBonus(double gratificacion) {
        double prima = 2000;
        return  prima + gratificacion + ParaJefes.bonus;
    }

}

class Alumnos extends Personas {
    private String a_obtativas;
    private String aula;
    public Alumnos(String nom, String a_obtativas, String aula) {
        super(nom);
        this.a_obtativas=a_obtativas;
        this.aula=aula;
    }

    @Override
    public String getDescripcion() {
        return "El alumno " + this.getNombre() + " está en el aula " + aula + " y ha escogido " +
                a_obtativas;
    }
}
