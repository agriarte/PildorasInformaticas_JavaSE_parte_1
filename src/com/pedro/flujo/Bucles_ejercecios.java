package com.pedro.flujo;


import javax.swing.*;



public class Bucles_ejercecios {

    public static void main(String[] args) {
        boolean c1,c2,c3,c4;
        c1=false;
        c2=false;
        c3=false;
        c4=false;

        do{
            String email = JOptionPane.showInputDialog("Introduce email ");

            //verificar condición 1, deber tener @
            for (int i = 0; i < email.length(); i++) {
                char mi_char = email.charAt(i);
                // ojo a la comilla simple
                if (mi_char=='@') {
                    c1=true;
                }
            }

            //verificar condición 2, solo deber tener un simbolo @
            int contador_arrobas=0;
            for (int i = 0; i < email.length(); i++) {
                char mi_char = email.charAt(i);
                // ojo a la comilla simple
                if (mi_char=='@') {
                   contador_arrobas++;
                }
                if (contador_arrobas==1) {
                    c2=true;
                } else {
                    c2=false;
                }
                System.out.println(contador_arrobas);
            }



            //verificar condición 3, deber tener un punto
            for (int i = 0; i < email.length(); i++) {
                char mi_char = email.charAt(i);
                // ojo a la comilla simple
                if (mi_char=='.') {
                    c3=true;
                }
            }


            //verificar condición 4, deber tener al menos 4 caracteres
            if (email.length()>=4) c4=true;

            System.out.println(c1);
            System.out.println(c2);
            System.out.println(c3);
            System.out.println(c4);
        }while (!(c1&&c2&&c3&&c4));
    }


}
