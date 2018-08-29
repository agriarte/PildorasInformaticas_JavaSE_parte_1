package com.pedro;

import java.util.Calendar;

public class pruebasCalendar {
    public static void main(String[] args) {
        Calendar ahoraCal = Calendar.getInstance();
        System.out.println("ANYO: "+ahoraCal.get(Calendar.YEAR));
        System.out.println("MES: "+ahoraCal.get(Calendar.MONTH));
        System.out.println("DIA: "+ahoraCal.get(Calendar.DATE));
        System.out.println("HORA: "+ahoraCal.get(Calendar.HOUR));
        System.out.println("HORA: "+ahoraCal.get(Calendar.MINUTE));
    }
}
