package folha_de_pagamento_basico;

public class FuncionarioProducao extends Funcionario {
    
    private double valorPorPeca;
    private double quantidadeProduzida;
    private double bonus;

    public FuncionarioProducao (String nome, int id, double valorPorPeca, double quantidadeProduzida) {
        super(nome, id);
        this.valorPorPeca = valorPorPeca;
        this.quantidadeProduzida = quantidadeProduzida;
    }
    @Override
    public String getTipoExtra() {
        return "Produtividade: ";
    }    
    @Override
    public void calcularSalarioFinal() {
        bonus = valorPorPeca * quantidadeProduzida;
        salarioFinal = salarioBase + bonus;
        extras = bonus;
    }
}
