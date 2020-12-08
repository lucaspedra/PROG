/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DAW119
 */
import java.util.Scanner;

/**
 *
 * @author daw119
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Scanner sc=new Scanner (System.in);
    int dni;
    int resto;
    System.out.println("introduzca o numero do dni");
    dni=sc.nextInt();   // TODO code application logic here        
    resto=(dni%23);
    switch(resto){
        case 0:{
                System.out.println("o nif e :"+dni+"T");
                break;
                }  
        case 1:{
                System.out.println("o nif e :"+dni+"R");
                break;
                }   
        case 2:{
                System.out.println("o nif e :"+dni+"w");
                break;
                }                          
         case 3:{
                System.out.println("o nif e :"+dni+"A");
                break;
                }  
         case 4:{
                System.out.println("o nif e :"+dni+"G");
                break;
                }
         case 5:{
                System.out.println("o nif e :"+dni+"M");
                break;
                }
          case 6:{
                System.out.println("o nif e :"+dni+"Y");
                break;
                }         
          case 7:{
                System.out.println("o nif e :"+dni+"F");
                break;
                }
          case 8:{
                System.out.println("o nif e :"+dni+"P");
                break;
                }
          case 9:{
                System.out.println("o nif e :"+dni+"D");
                break;
                }
          case 10:{
                System.out.println("o nif e :"+dni+"X");
                break;
                }
          case 11:{
                System.out.println("o nif e :"+dni+"B");
                break;
                }   
        case 12:{
                System.out.println("o nif e :"+dni+"N");
                break;
                }                          
         case 13:{
                System.out.println("o nif e :"+dni+"J");
                break;
                }  
         case 14:{
                System.out.println("o nif e :"+dni+"Z");
                break;
                }
         case 15:{
                System.out.println("o nif e :"+dni+"S");
                break;
                }
          case 16:{
                System.out.println("o nif e :"+dni+"Q");
                break;
                }         
          case 17:{
                System.out.println("o nif e :"+dni+"V");
                break;
                }
          case 18:{
                System.out.println("o nif e :"+dni+"H");
                break;
                }
          case 19:{
                System.out.println("o nif e :"+dni+"L");
                break;
                }
          case 20:{
                System.out.println("o nif e :"+dni+"C");
                break; }
          case 21:{
                System.out.println("o nif e :"+dni+"K");
                break;}      
          case 22:{
                System.out.println("o nif e :"+dni+"E");
                break;
          }
          }
    }
    }