/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funções;

import java.util.Scanner;

/**
 *
 * @author pedri
 */
public class FuncoesUri {
    
    public static void Uri1001(){
        
        int a, b, x;
        
        Scanner ler = new Scanner(System.in);
        
        a = ler.nextInt();
        b = ler.nextInt();
        
        x = a + b;
        
        System.out.println("X = "+x);
        
    }
    
    public static void Uri1002(){
        
        double raio, x;
        double n = 3.14159;
        
        Scanner ler = new Scanner(System.in);
        
        raio = ler.nextDouble();
        
        x = n * (Math.pow(raio, 2));
        
        System.out.println("A="+x);
        
    }
    
    public static void Uri1003(){
        
        int a, b, soma;
        
        Scanner ler = new Scanner(System.in);
        
        a = ler.nextInt();
        b = ler.nextInt();
        
        soma = a + b;
        
        System.out.println("SOMA = "+soma);
        
    }
    
    public static void Uri1004(){
        
        int a, b, prod;
        
        Scanner ler = new Scanner(System.in);
        
        a = ler.nextInt();
        b = ler.nextInt();
        
        prod = a * b;
        
        System.out.println("PROD = "+prod);
        
    }
    
}
