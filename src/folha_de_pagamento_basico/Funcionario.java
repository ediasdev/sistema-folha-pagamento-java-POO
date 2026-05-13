package folha_de_pagamento_basico;

public abstract class Funcionario {
    
    String nome;
    protected static double salarioBase = 2000;
    protected int id;
    protected double salarioFinal;
    protected double extras = 0;

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
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + id);
        System.out.println("Salário Fixo: " + String.format("%.2f", salarioBase));
        System.out.println(getTipoExtra() + String.format("%.2f", extras));
        System.out.println("Salário final: " + String.format("%.2f", salarioFinal));
    }
}
