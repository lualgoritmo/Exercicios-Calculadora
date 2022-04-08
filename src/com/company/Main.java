package com.company;

import java.util.Scanner;
import java.util.WeakHashMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números e a operação");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        int controle = 0;
        while(true){
            Scanner leitor = new Scanner(System.in);
            System.out.println("Somar 0");
            System.out.println("Subtração 1");
            System.out.println("Multiplicar 2");
            System.out.println("Dividir 3");
            System.out.println("Sair 4");
            System.out.println();
            double resultado = 0;
            double condicao = leitor.nextDouble();
            if(condicao == 0){
                resultado = n1 + n2;
                System.out.println("Soma: " + resultado);
            }
            else if(condicao == 1){
                resultado = n1 - n2;
                System.out.println("Subtração: " + resultado);
            }
            else if(condicao == 2){
                resultado = n1 * n2;
                System.out.println("Multiplicação: " + resultado);
            }
            else if(condicao == 3){
                resultado = n1 / n2;
                System.out.println("Divisao: " + resultado);
            }
            else if(condicao == 4){

                System.exit(0);
            }
            else {
                System.out.println("Opção Inválida");
            }
            controle++;
        }
    }
}
