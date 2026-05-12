package folha_de_pagamento_basico;

public class FuncionarioProducao extends Funcionario {
    
    double valorPorPeca;
    double quantidadeProduzida;
    double bonus;

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
    }
    @Override
    public void exibirFolhaPagamento() {
        extras = bonus;
        super.exibirFolhaPagamento();
    }
}
