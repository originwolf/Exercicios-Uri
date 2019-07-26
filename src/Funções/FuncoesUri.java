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
        
        System.out.printf("TOTAL = R$ %.2f\n",salarioTotal);
        
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
        
        System.out.printf("VALOR A PAGAR: %.2f\n",totalConta);
        
    }
    
    public static void Uri1011(){
        
        double raio, volumeEsfera;
        
        Scanner ler = new Scanner(System.in);
        
        raio = ler.nextDouble();
        
        volumeEsfera = ((4.0/3)*3.14159)*Math.pow(raio, 3);
        
        System.out.printf("VOLUME = %.3f\n",volumeEsfera);
        
    }
    
    public static void Uri1012(){
        
        double a, b, c;
        double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
        
        Scanner ler = new Scanner(System.in);
        
        a = ler.nextDouble();
        b = ler.nextDouble();
        c = ler.nextDouble();
        
        areaTriangulo = (a * c) / 2;
        areaCirculo = 3.14159 * Math.pow(c, 2);
        areaTrapezio = ((a + b) * c) / 2;
        areaQuadrado = b*b;
        areaRetangulo = a * b;
        
        System.out.printf("TRIANGULO %.3f\n",areaTriangulo);
        System.out.printf("CIRCULO %.3f\n",areaCirculo);
        System.out.printf("TRAPEZIO %.3f\n",areaTrapezio);
        System.out.printf("QUADRADO %.3f\n",areaQuadrado);
        System.out.printf("RETANGULO %.3f\n",areaRetangulo);
        
    }
    
    public static void Uri1013(){
        
        double a, b, c, maiorab, maior;
        
        Scanner ler = new Scanner(System.in);
        
        a = ler.nextDouble();
        b = ler.nextDouble();
        c = ler.nextDouble();
        
        maiorab = (a + b + Math.abs(a - b)) / 2;
        
        maior = (maiorab + c + Math.abs(maiorab - c)) / 2;
        
        System.out.printf("%.0f eh o maior\n",maior);
        
    }
    
    public static void Uri1014(){
        
        double distanciaPercorrida, gastoCombustivel, rendimento;
        
        Scanner ler = new Scanner(System.in);
        
        distanciaPercorrida = ler.nextDouble();
        gastoCombustivel = ler.nextDouble();
        
        rendimento = distanciaPercorrida / gastoCombustivel;
        
        System.out.printf("%.3f km/l\n",rendimento);
        
    }
    
    public static void Uri1015(){
        
        double x1, x2, y1, y2, distancia;
        
        Scanner ler = new Scanner(System.in);
        
        x1 = ler.nextDouble();
        y1 = ler.nextDouble();
        x2 = ler.nextDouble();
        y2 = ler.nextDouble();
        
        distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        
        System.out.printf("%.4f\n",distancia);
        
    }
    
    public static void Uri1016(){
        
        double velocidadeX, velocidadeY, distancia, tempo;
        
        Scanner ler = new Scanner(System.in);
        
        distancia = ler.nextDouble();
        
        velocidadeX = 60;
        velocidadeY = 90;
        
        tempo = (60 * distancia) / 30;
        
        System.out.printf("%.0f minutos\n",tempo);
        
    }
    
    public static void Uri1017(){
        
        double tempoDeViagem, velocidadeMedia, distanciaPercorrida, gastoCombustivel;
        
        Scanner ler = new Scanner(System.in);
        
        tempoDeViagem = ler.nextDouble();
        velocidadeMedia = ler.nextDouble();
        
        distanciaPercorrida = tempoDeViagem * velocidadeMedia;
        
        gastoCombustivel = distanciaPercorrida / 12;
        
        System.out.printf("%.3f\n",gastoCombustivel);
        
    }
    
    public static void Uri1018(){
        
        int valor;
        
        Scanner ler = new Scanner(System.in);
        
        valor = ler.nextInt();
        
        System.out.printf("%d nota(s) de R$ 100,00\n",valor/100);
        valor %= 100;
        System.out.printf("%d nota(s) de R$ 50,00\n",valor/50);
        valor %= 50;
        System.out.printf("%d nota(s) de R$ 20,00\n",valor/20);
        valor %= 20;
        System.out.printf("%d nota(s) de R$ 10,00\n",valor/10);
        valor %= 10;
        System.out.printf("%d nota(s) de R$ 50,00\n",valor/5);
        valor %= 5;
        System.out.printf("%d nota(s) de R$ 2,00\n",valor/2);
        valor %= 2;
        System.out.printf("%d nota(s) de R$ 1,00\n",valor/1);
        
        /*
        quantidade = valor / 100;
        System.out.printf("%d nota(s) de R$ 100,00\n",quantidade);
        sobra = valor%100;
        valor = sobra;
        
        quantidade = valor / 50;
        System.out.printf("%d nota(s) de R$ 50,00\n",quantidade);
        sobra = valor%50;
        valor = sobra;
        
        quantidade = valor / 20;
        System.out.printf("%d nota(s) de R$ 20,00\n",quantidade);
        sobra = valor%20;
        valor = sobra;
        
        quantidade = valor / 10;
        System.out.printf("%d nota(s) de R$ 10,00\n",quantidade);
        sobra = valor%10;
        valor = sobra;
        
        quantidade = valor / 5;
        System.out.printf("%d nota(s) de R$ 5,00\n",quantidade);
        sobra = valor%5;
        valor = sobra;
        
        quantidade = valor / 2;
        System.out.printf("%d nota(s) de R$ 2,00\n",quantidade);
        sobra = valor%2;
        valor = sobra;
        
        quantidade = valor / 1;
        System.out.printf("%d nota(s) de R$ 1,00\n",quantidade);
        sobra = valor%1;
        */
        
        /*
        notas100 = valor / 100;
        sobra = valor%100;
        valor = sobra;
        
        notas50 = valor / 50;
        sobra = valor%50;
        valor = sobra;
        
        notas20 = valor / 20;
        sobra = valor%20;
        valor = sobra;
        
        notas10 = valor / 10;
        sobra = valor%10;
        valor = sobra;
        
        notas5 = valor / 5;
        sobra = valor%5;
        valor = sobra;
        
        notas2 = valor / 2;
        sobra = valor%2;
        valor = sobra;
        
        notas1 = valor / 1;
        sobra = valor%1;
        
        System.out.printf("%d nota(s) de R$ 100,00\n"
                + "%d nota(s) de R$ 50,00\n"
                + "%d nota(s) de R$ 20,00\n"
                + "%d nota(s) de R$ 10,00\n"
                + "%d nota(s) de R$ 5,00\n"
                + "%d nota(s) de R$ 2,00\n"
                + "%d nota(s) de R$ 1,00\n",notas100, notas50, notas20, notas10, notas5, notas2, notas1);
        */
        
    }
    
}
