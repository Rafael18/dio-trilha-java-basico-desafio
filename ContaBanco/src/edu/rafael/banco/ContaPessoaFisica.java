package edu.rafael.banco;

public class ContaPessoaFisica {
    public int numero;
    public String agencia;
    public String nomeCliente;
    public double saldo;

    public void deposito(double saldo){
        this.saldo += saldo;
        System.out.println("Deposito no valor de "+saldo+" realizado com sucesso. Novo saldo: R$"+this.saldo);
    }

    public void saque(double saldo){
        this.saldo -= saldo;
        System.out.println("Saque no valor de "+saldo+" realizado com sucesso. Novo saldo: R$"+this.saldo);
    }

    public void imprimirDadosCliente(ContaPessoaFisica pf){
        System.out.println(
            "Olá "
            .concat(pf.nomeCliente)
            .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
            .concat(pf.agencia)
            .concat(", conta ")
            + pf.numero+""
            .concat(", e seu saldo ")
            + pf.saldo +""
            .concat(" já está disponível para saque.")
        );
    }
}