/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DAW119
 */
//Introducir 2 numeros sumar si son pares, el primer es menor que 50 y el segundo entre 100 y 500
import java.util.Scanner;
public class Ejercicio1 {
    public static void main (String args[]){
        int n1;
        int n2;
        int suma;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introducir numero 1: ");
        n1=sc.nextInt();
        System.out.println("Introducir numero 2: ");
        n2=sc.nextInt(); 
        if((n1%2==0)&&(n2%2==0)&&(n1<50)&&(n2>100)&&(n2<500)){
            
            suma= n1 + n2;
            System.out.println("La suma es :" +suma);
        } else{
            System.out.println("Error");
        }
    }
}