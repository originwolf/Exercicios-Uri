/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funções;

import java.util.Scanner;
import java.lang.String;

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
        
        System.out.println("X = " + x);
        
    }
    
    public static void Uri1002(){
        
        double raio, x;
        double n = 3.14159;
        
        Scanner ler = new Scanner(System.in);
        
        raio = ler.nextDouble();
        
        x = n * (Math.pow(raio, 2));
        
        System.out.println("A=" + x);
        
    }
    
    public static void Uri1003(){
        
        int a, b, soma;
        
        Scanner ler = new Scanner(System.in);
        
        a = ler.nextInt();
        b = ler.nextInt();
        
        soma = a + b;
        
        System.out.println("SOMA = " + soma);
        
    }
    
    public static void Uri1004(){
        
        int a, b, prod;
        
        Scanner ler = new Scanner(System.in);
        
        a = ler.nextInt();
        b = ler.nextInt();
        
        prod = a * b;
        
        System.out.println("PROD = " + prod);
        
    }
    
    public static void Uri1005(){
        
        double x, y, media;
        
        Scanner ler = new Scanner(System.in);
        
        y = ler.nextDouble();
        x = ler.nextDouble();

        media = ((y * 3.5) + (x * 7.5)) / 11;
        
        System.out.println("MEDIA = " + media);
       
    }
    
    public static void Uri1006(){
        
        double a, b, c, media;
        
        Scanner ler = new Scanner(System.in);
        
        a = ler.nextDouble();
        b = ler.nextDouble();
        c = ler.nextDouble();
        
        media = ((a * 2) + (b * 3) + (c * 5)) / 10;
        
        System.out.println("MEDIA = " + media);
        
    }
    
    public static void Uri1007(){
        
        int a, b, c, d, diferenca;
        
        Scanner ler = new Scanner(System.in);
        
        a = ler.nextInt();
        b = ler.nextInt();
        c = ler.nextInt();
        d = ler.nextInt();
                 
        diferenca = ((a * b) - (c * d));
        
        System.out.println("DIFERENCA = "+diferenca);
        
    }
    
    public static void Uri1008(){
        
        double horasTrabalhadas, salarioHora, salarioTotal;
        int numeroFuncionario;
        
        Scanner ler = new Scanner(System.in);
        
        numeroFuncionario = ler.nextInt();
        horasTrabalhadas = ler.nextDouble();
        salarioHora = ler.nextDouble();
        
        salarioTotal = salarioHora * horasTrabalhadas;
        
        System.out.println("NUMBER = "+numeroFuncionario);
        System.out.println("SALARY = U$ "+salarioTotal);
        
    }
    
    public static void Uri1009(){
        
        String nomeVendedor;
        double salarioFixo, vendasEfetuadas, comissao, salarioTotal;
        
        Scanner ler = new Scanner(System.in);
        
        nomeVendedor = ler.nextLine();
        salarioFixo = ler.nextDouble();
        vendasEfetuadas = ler.nextDouble();
        
        comissao = (vendasEfetuadas * 15) / 100;
        
        salarioTotal = comissao + salarioFixo;
        
        System.out.printf("TOTAL = R$ %.2f",salarioTotal);
        
    }
    
    public static void Uri1010(){
        
        int codPeca1, numPeca1, codPeca2, numPeca2;
        double valorPeca1, valorPeca2, totalConta;
        
        Scanner ler = new Scanner(System.in);
        
        codPeca1 = ler.nextInt();
        numPeca1 = ler.nextInt();
        valorPeca1 = ler.nextDouble();
        codPeca2 = ler.nextInt();
        numPeca2 = ler.nextInt();
        valorPeca2 = ler.nextDouble();
        
        totalConta = ((numPeca1 * valorPeca1) + (numPeca2 * valorPeca2));
        
        System.out.printf("VALOR A PAGAR: %.2f",totalConta);
        
    }
    
}
