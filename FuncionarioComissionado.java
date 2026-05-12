package folha_de_pagamento_basico;

public class FuncionarioComissionado extends Funcionario {
    
    double vendas;
    double percentualComissao;
    double comissao;

    public FuncionarioComissionado (String nome, int id, double vendas, double percentualComissao) {
        super(nome, id);
        this.vendas = vendas;
        this.percentualComissao = percentualComissao;
    }
    @Override
    public void calcularSalarioFinal() {
        comissao = vendas * percentualComissao / 100;
        salarioFinal = salarioBase + comissao;
    }
    @Override
    public String getTipoExtra() {
        return "Comissão: ";
    }    
    @Override
    public void exibirFolhaPagamento() {
        extras = comissao;
        super.exibirFolhaPagamento();
        
    }
}
