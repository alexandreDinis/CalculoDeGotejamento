package com.company.exercicios;

import com.company.exercicios.dominun.interfaces;
import com.company.exercicios.dominun.showMenu;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        interfaces app = new interfaces();
        showMenu show = new showMenu();
        Scanner tc = new Scanner(System.in);

        int op = 0;

        show.menuPrincipal();
        op = tc.nextInt();


        while(op<5) {

            switch (op) {

               case 1:
                   app.gotas();
                   op = tc.nextInt();
                   break;

               case 2:
                   app.microGotas();
                   op = tc.nextInt();
                   break;

               default:
                   show.menuPrincipal();
                   op = tc.nextInt();
                    break;
           }
        }
    }
}
