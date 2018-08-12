package com.pedro;

public class appendString {
    public static void main(String[] args) {

        //forma 1, menos eficiente con +
        String cadena="";
        String h = "h";
        String o = "o";
        String l = "l";
        String a = "a";

        cadena=cadena+h+o+l+a;

        System.out.println(cadena);

        //forma 2, mucho mas rápida con la clase StringBuilder
        StringBuilder sb = new StringBuilder("Hola ");
        String cadena2 = sb.append("amigo, ").append("que tal?").toString();

        System.out.println(cadena2);
    }
}
