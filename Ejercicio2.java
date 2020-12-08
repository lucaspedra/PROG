/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 2.	Diseñar un programa que calcule el importe final de una venta considerando
que sobre el valor bruto se hace un descuento según la siguiente tabla:

Valores <=200	          No se aplica descuento
Valores >200 y <=1000	          Descuento 5%	
Valores >1000			 Descuento 10%

 */
import java.util.Scanner;

/**
 *
 * @author daw119
 */
public class Ejercicio2 {
    public static void main(String[] args) { 
    Scanner sc=new Scanner (System.in);
    double pvp;
    System.out.println("introduzca prcio producto");
    pvp=sc.nextDouble();
    
    if ((pvp>200)&&(pvp<=1000))
        {
        pvp=pvp-(pvp*5/100);
        }
    if (pvp>1000){
        pvp=pvp-(pvp*10/100);
    }
      System.out.println("O precio fina el  : "+pvp);
    }
    
}