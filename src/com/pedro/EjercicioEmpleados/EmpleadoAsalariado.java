package com.pedro.EjercicioEmpleados;

import java.util.Calendar;

public class EmpleadoAsalariado extends Empleado {

    private double salarioBase;
    private int antiguedad;

    public EmpleadoAsalariado(String nombre, String apellidos, String dni, int anyo, double salarioBase) {
        super(nombre, apellidos, dni, anyo);
        /*
        Menos de 2 años: Solo tienen salario base
        Entre 2 y 3 años: Un 7% del salario base
        Entre 4 y 8 años: Un 11% del salario base
        Entre 9 y 15 años: Un 17% del salario base*/
        Calendar ahoraCal = Calendar.getInstance();

        antiguedad = ahoraCal.get(Calendar.YEAR)-anyo; // año actual - año de alta

        if (antiguedad < 2 ) {
            this.salarioBase=salarioBase;//salario inicial
        } else if (antiguedad >=2 && antiguedad <=3 ){
            this.salarioBase=salarioBase + ((7.0 / 100.0) * salarioBase);//salario inicial + 7%
        } else if (antiguedad >=4 && antiguedad <=8 ){
            this.salarioBase=salarioBase + ((11.0 / 100.0) * salarioBase);//salario inicial + 11%
        } else if (antiguedad >=9 && antiguedad <=15 ){
            this.salarioBase=salarioBase + ((17.0 / 100.0) * salarioBase);//salario inicial + 7%
        }


    }

    @Override
    public double getSalario() {
        return salarioBase;
    }

    public String imprimir() {
        return "un empleado asalariado con nombre " + this.getNombre() +
                " apellidos " + this.getApellidos() +
                " dni " + this.getDni() +
                " año " + this.getAnyo() +
                " sueldo " + this.getSalario();
    }




}
