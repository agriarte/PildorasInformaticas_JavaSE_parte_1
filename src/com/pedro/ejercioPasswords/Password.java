package com.pedro.ejercioPasswords;

public class Password {
    private int lon;//num caracteres contraseña
    private String password;

    public Password(int lon, String password) {
        this.lon = lon;
        this.password = password;
    }

    private String generarPassword (int lon){
        //genera contraseña de longitud len
        for (int i = 0; i <lon ; i++) {
            //añadir lon caracteres para formar password
            //password.concat(Math.random(65));
        }

        return password;
    }
}
