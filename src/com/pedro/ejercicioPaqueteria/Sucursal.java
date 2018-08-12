package com.pedro.ejercicioPaqueteria;

public class Sucursal {

    private int num_sucursal;
    private String direccion;
    private String ciudad;
    private int precio;

    public Sucursal(int num_sucursal, String direccion, String ciudad) {
        this.num_sucursal = num_sucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getNum_sucursal() {
        return num_sucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public double setPrecio(Paquete paquete) {

    /*Método setter que calcula precio. Este método recibe por parámetro un objeto de tipo Paquete y calcula
    el precio del envío del paquete en función del peso del mismo y la prioridad del envío (0, 1 o 2
    siendo estos 0=normal, 1=Alta y 2=Urgente). Prioridad 0 el precio no se altera.
    Prioridad 1 el precio se incremente 10 €. Prioridad 2 el precio se incrementa 20 €.
    */
        double precio = 0;
        switch (paquete.getPrioridad()) {
            case 0:
                precio = 0;
                break;
            case 1:
                precio = 10;
                break;
            case 2:
                precio = 20;
                break;
        }

        precio = precio + (paquete.getPeso() * 1.5);
        return precio;
    }
}
