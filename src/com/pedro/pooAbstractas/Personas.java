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

class Empleados extends Personas {

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
}

class Jefes extends Empleados {
    private double incentivo;
    public Jefes(String nom, Date fechaAlta, double sueldo) {
        super(nom, fechaAlta, sueldo);
    }

    private void setIncentivo (double incentivo){
        this.incentivo=incentivo;
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
