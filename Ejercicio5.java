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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner (System.in);
        int año;
        System.out.println("Introducir año");
        año=sc.nextInt();
        if((año%4==0)&&(año%100 !=0)||(año%4==0)){
         System.out.println("Es bisiesto");
        }else{
            System.out.println("No es bisiesto");
        }
    }
}
  