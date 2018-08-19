package com.pedro.ejercioPasswords;

public class Password {
    public String getPassword;
    private int lon;//num caracteres contraseña
    private String password;


    public Password(int lon) {
        this.lon = lon;
    }

    public Password(int lon, String password) {
        this.lon = lon;
        this.password = password;
    }

    public Password() {

    }

    public String generarPassword(int lon, String resetPassword) {

        password = resetPassword;
        //genera contraseña de longitud len
        for (int i = 0; i < lon; i++) {
            //con Random se llama al azar a los métodos dameNumero o dameLetra para construir password
            //para obtener un password de longitud "lon".

            switch ((int) (Math.random() * 3)) {
                case 0:
                    password = password + dameLetraMayuscula();
                    break;
                case 1:
                    password = password + dameLetraMinuscula();
                    break;
                case 2:
                    password = password + dameNumero();
                    break;
            }
        }

        return password;
    }

    // devuelve letra mayuscula al azar
    private String dameLetraMayuscula() {
        int n = (int) (Math.random() * 26 + 65);
        return Character.toString((char) n);
    }

    // devuelve letra minuscula al azar
    private String dameLetraMinuscula() {
        int n = (int) (Math.random() * 26 + 97);
        return Character.toString((char) n);
    }

    // devuelve numero al azar
    private String dameNumero() {
        int n = (int) (Math.random() * 10 + 48);
        return Character.toString((char) n);
    }

    //devuelve longitud del password
    public int getTamanyo() {
        return password.length();
    }



}
