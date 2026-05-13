package folha_de_pagamento_basico;

public class FuncionarioComissionado extends Funcionario {
    
    private double vendas;
    private double percentualComissao;
    private double comissao;

    public FuncionarioComissionado (String nome, int id, double vendas, double percentualComissao) {
        super(nome, id);
        this.vendas = vendas;
        this.percentualComissao = percentualComissao;
    }
    @Override
    public void calcularSalarioFinal() {
        comissao = vendas * percentualComissao / 100;
        salarioFinal = salarioBase + comissao;
        extras = comissao;
    }
    @Override
    public String getTipoExtra() {
        return "Comissão: ";
    }    
}
