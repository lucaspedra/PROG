/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2;

/**
 *
 * @author lucas
 */
import java.util.Scanner;
public class Ejercicio4 {
    public static void main (String [] args) {
        int dia;
        Scanner sc= new Scanner (System.in);
        System.out.println("Introducir dia :");
        dia=sc.nextInt();
        switch(dia) {
            case 1: {
                    System.out.println("Lunes");
                    break;
                    }
            case 2: {
                    System.out.println("Martes");
                    break;
                    }
            case 3: {
                    System.out.println("Miercoles");
                    break;
                    }
            case 4: {
                    System.out.println("Jueves");
                    break;
                    }
            case 5: {
                    System.out.println("Viernes");
                    break;
                    }
            case 6: {
                    System.out.println("Sabado");
                    break;
                    }
            case 7: {
                    System.out.println("Domingo");
                    break;
                    }
            default: 
                System.out.println("Error");
        }
    }
}
     