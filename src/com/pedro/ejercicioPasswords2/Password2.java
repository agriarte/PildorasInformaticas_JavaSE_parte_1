package com.pedro.ejercicioPasswords2;

public class Password2 {
    private int lon;//num caracteres contraseña
    private String password;


    public Password2(int lon) {
        this.lon = lon;
    }

    public Password2(int lon, String password) {
        this.lon = lon;
        this.password = password;
    }

    public Password2() {

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
        String letra = Character.toString((char) n);
        return letra;
    }

    // devuelve letra minuscula al azar
    private String dameLetraMinuscula() {
        int n = (int) (Math.random() * 26 + 97);
        String letra = Character.toString((char) n);
        return letra;
    }

    // devuelve numero al azar
    private String dameNumero() {
        int n = (int) (Math.random() * 10 + 48);
        String numero = Character.toString((char) n);
        return numero;
    }

    //devuelve longitud del password
    public int getTamanyo() {
        return password.length();
    }

    //devuelve password
    public String getPassword() {
        return password;
    }

    //devuelve TRUE si contiene al menos 5 numeros, 2 mayusculas y 1 minuscula
    public Boolean esSegura() {
        if (password.length() > 5 && cuentaNumeros() > 4 && cuentaMayusculas() > 2 && cuentaMinusculas() > 1)  {
            return true;
        } else {
            return false;
        }
    }

    private int cuentaNumeros() {
        int n;
        int suma=0;
        for (int i = 0; i < password.length(); i++) {
            n = password.codePointAt(i);
            if (n >= 48 && n <= 57) {
                suma++;
            }
        }
        return suma;
    }
    private int cuentaMayusculas() {
        int n;
        int suma=0;
        for (int i = 0; i < password.length(); i++) {
            n = password.codePointAt(i);
            if (n >= 65 && n <= 90) {
                suma++;
            }
        }
        return suma;
    }

    private int cuentaMinusculas() {
        int n;
        int suma=0;
        for (int i = 0; i < password.length(); i++) {
            n = password.codePointAt(i);
            if (n >= 97 && n <= 122) {
                suma++;
            }
        }
        return suma;
    }
}



