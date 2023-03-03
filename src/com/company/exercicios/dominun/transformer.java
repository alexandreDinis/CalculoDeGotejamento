package com.company.exercicios.dominun;


import java.util.Scanner;

public class transformer {
  Scanner tc = new Scanner(System.in);

    public double gotasPorMinutos(double hora , double ml) {
        double tempo = 60 * hora;
        double solution = ml * 20;
        double result = solution / tempo;
        return result;
    }
    public double microGotasPorMinutos(double hora, double ml) {
        double tempo = 60 * hora;
        double solution = ml * 60;
        double result = solution / tempo;
        return result;
    }
}