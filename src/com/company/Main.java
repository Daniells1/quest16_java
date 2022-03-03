/*
Crie um programa para calcular o salário de uma vendedora. O programa deve pedir
o valor vendido no mês pela vendedora. Se o valor for até R$ 10.000,00 ela recebe o
salário base mais 2% do valor vendido. Se a vendedora vendeu entre R$ 10.000,00 e
R$ 100.000,00, ela recebe o salário base mais 3,5% do valor vendido. Se a vendedora
vendeu mais que R$ 100.000,00, ela recebe o salário base mais 4,2% do valor
vendido
 */

package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("O salário base da vendedora");
         double salario_base = scanner.nextDouble();
        System.out.println("O valor das vendas realizadas");
        double vendas = scanner.nextDouble();
        double salario_final;
        if(vendas<= 10000){
            salario_final=salario_base + 0.02*vendas;
            System.out.println("O valor a ser recebido é=R$ "+salario_final);
        }
        if(vendas > 10000 && vendas <100000 ){
            salario_final=salario_base + 0.035*vendas;
            System.out.println("O valor a ser recebido é=R$ "+salario_final);
        }
        if(vendas > 100000 ){
            salario_final=salario_base + 0.042*vendas;
            System.out.println("O valor a ser recebido é=R$ "+salario_final);
        }
    }
}
