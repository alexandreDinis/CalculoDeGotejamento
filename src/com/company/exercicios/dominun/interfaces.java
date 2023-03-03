package com.company.exercicios.dominun;

import java.util.Scanner;

public class interfaces {
    transformer app = new transformer();
    Scanner tc = new Scanner(System.in);
    int op = 0;

    public void gotas(){
        System.out.println("________________ CALCULO DE GOTEJAMENTO__________________");
        System.out.println("                   Gotas por Minutos");
        System.out.println("ENTRE COM A HORA:   ");
        double hora = tc.nextDouble();
        System.out.println("ENTRE COM  ML:   ");
        double ml = tc.nextDouble();

        double result = app.gotasPorMinutos(hora, ml);

        System.out.println("Resultado:  ->  " + result + " Gotas por minuto");
        System.out.println("");
        System.out.println(" Para um novo calculo digite 1 ou 3 voltar ao menu principal");
    }

    public void microGotas (){
        System.out.println("________________ CALCULO DE GOTEJAMENTO__________________");
        System.out.println("                 Micro Gotas por Minutos");
        System.out.println("ENTRE COM A HORA:   ");
        double horas = tc.nextDouble();
        System.out.println("ENTRE COM  ML:   ");
        double mlg = tc.nextDouble();

        double results = app.microGotasPorMinutos(horas, mlg);

        System.out.println("Resultado:  ->  " + results + " Micro gotas por minuto");
        System.out.println("");
        System.out.println(" Para um novo calculo digite 2 ou 3 voltar ao menu principal");
    }

}
