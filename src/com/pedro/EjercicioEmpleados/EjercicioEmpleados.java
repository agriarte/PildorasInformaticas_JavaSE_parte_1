package com.pedro.EjercicioEmpleados;

public class EjercicioEmpleados {
    public static void main(String[] args) {


        Empleado[] misEmpleados = new Empleado[4];

        EmpleadoAsalariado emple0 = new EmpleadoAsalariado("Antonio", "López", "6546546Z", 2014, 1125);
        misEmpleados[0] = emple0;

        EmpleadoComision emple1 = new EmpleadoComision("Sandra", "Nieto", "7879879S2", 2011, 169, 7.10);
        misEmpleados[1] = emple1;

        EmpleadoComision emple2 = new EmpleadoComision("Manuel", "Ruiz", "83487583A", 2011);
        misEmpleados[2] = emple2;

        emple2.setClientes(35);
        emple2.setPuntos(6.9);

        EmpleadoAsalariado emple3 = new EmpleadoAsalariado("María", "Ramos", "77879878F", 2011, 1055);
        misEmpleados[3] = emple3;

        /*System.out.println(misEmpleados[0].imprimir());
        System.out.println(misEmpleados[1].imprimir());
        System.out.println(misEmpleados[2].imprimir());
        System.out.println(misEmpleados[3].imprimir());*/

        mostrarTodo(misEmpleados);
        System.out.println(sueldoMayor(misEmpleados));

    }

    private static void mostrarTodo(Empleado[] misEmpleados) {
        for (Empleado empleado : misEmpleados) {
            System.out.println(empleado.imprimir());
        }

    }

    private static String sueldoMayor(Empleado[] misEmpleados) {
        double sueldoAlto = 0;
        int indice = 0;
        for (int i = 0; i < (misEmpleados.length); i++) {
            if (misEmpleados[i].getSalario() > sueldoAlto) {
                indice = i;
                sueldoAlto = misEmpleados[i].getSalario();
            }
        }

        return "Empleado mayor sueldo\n" + misEmpleados[indice].getNombre() + " " + misEmpleados[indice].getApellidos() + " " + misEmpleados[indice].getSalario();
    }

}


