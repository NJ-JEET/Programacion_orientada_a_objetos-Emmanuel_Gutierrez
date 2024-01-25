package edu.emmanuel_gutierrez.reto1.ui;

import edu.emmanuel_gutierrez.reto1.process.CalculadoraMasaCorporal;

import java.util.Scanner;

public class CLI {
    public static void showMenu() {
        System.out.println("*************");
        System.out.println("1. calculo de masa corporal");
        System.out.println("2. calculo de masa corporal magra");
        System.out.println("3. calculo de metabolismo basal");
        System.out.println("4. salir");
        System.out.println("*************");
    }

    public static void launchApp(){
        Scanner scanner = new Scanner(System.in);

        showMenu();
        int opcion = scanner.nextLine();



        switch(opcion){
            case 1:
                double imc =
                }
                break
            case 1:
                break
        }
    }
}
