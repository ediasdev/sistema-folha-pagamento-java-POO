package folha_de_pagamento_basico;

public class Funcionario {
    
    String nome;
    protected static double salarioBase = 2000;
    int id;
    protected double salarioFinal;
    double extras = 0;

    public Funcionario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }
    public void calcularSalarioFinal() {
        salarioFinal = salarioBase;
    }
    public String getTipoExtra() {
        return "Extras: ";
    }
    public void exibirFolhaPagamento() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.id);
        System.out.println("Salário Fixo: " + salarioBase);
        System.out.println(getTipoExtra() + extras);
        System.out.println("Salário final: " + salarioFinal);
    }
}
