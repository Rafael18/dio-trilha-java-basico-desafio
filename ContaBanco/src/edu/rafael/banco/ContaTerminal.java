package edu.rafael.banco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ContaPessoaFisica contaPF = new ContaPessoaFisica();
        
        System.out.println("Por favor, digite o número da Agencia:");
        contaPF.agencia = scanner.next();

        System.out.println("Por favor, digite o Número:");
        contaPF.numero = scanner.nextInt();

        System.out.println("Por favor, digite o Nome do Cliente:");
        contaPF.nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo:");
        contaPF.saldo = scanner.nextDouble();

        contaPF.imprimirDadosCliente(contaPF);

        contaPF.deposito(100.52);

        contaPF.saque(10);
    }
}
