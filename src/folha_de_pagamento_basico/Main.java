package folha_de_pagamento_basico;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        int opcao = 5;

        while (opcao != 0) {
            System.out.println("===Folha de pagamento ===");
            System.out.println("[1] Cadastrar Funcionário Padrão");
            System.out.println("[2] Cadastrar Funcionário Comissionado");
            System.out.println("[3] Cadastrar Funcionário Produção");
            System.out.println("[4] Gerar folha de pagamento");
            System.out.println("[0] Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("===Cadastro de Funcionário Padrão===");
                    String nome = lerNomeValido(scanner, "Digite o nome do funcionário: ");
                    int matricula = lerInteiroPositivo(scanner, "Informe a matrícula: ");
                    funcionarios.add(new FuncionarioPadrao(nome, matricula));
                    System.out.println("Funcionário " + nome + " cadastrado como Padrão.");
                    break;
                case 2:
                    System.out.println("===Cadastro de Funcionário Comissionado===");
                    String nomeComissionado = lerNomeValido(scanner, "Digite o nome do funcionário: ");
                    int matriculaComissionado = lerInteiroPositivo(scanner, "Informe a matrícula: ");
                    double vendas = lerRealPositivo(scanner, "Informe o valor das vendas: ");
                    double comissao = lerRealPositivo(scanner, "Informe comissão percentual: ");
                    funcionarios.add(new FuncionarioComissionado(nomeComissionado, matriculaComissionado, vendas, comissao));
                    System.out.println("Funcionário " + nomeComissionado + " cadastrado como Comissionado.");
                    break;
                case 3:
                    System.out.println("===Cadastro de Funcionário Produção===");
                    String nomeProducao = lerNomeValido(scanner, "Digite o nome do funcionário: ");
                    int matriculaProducao = lerInteiroPositivo(scanner, "Informe a matrícula: ");
                    int quantidadePecas = lerInteiroPositivo(scanner, "Informe a quantidade de peças: ");
                    double valorPeca = lerRealPositivo(scanner, "Informa o valor da peça: ");
                    funcionarios.add(new FuncionarioProducao(nomeProducao, matriculaProducao, valorPeca, quantidadePecas));
                    System.out.println("Funcionário " + nomeProducao + " cadastrado como Produção.");
                break;
                case 4:
                    System.out.println("Total de pessoas cadastradas: " + funcionarios.size());
                    System.out.println("---------------------");
                    for (Funcionario f : funcionarios) {
                        f.calcularSalarioFinal();
                        f.exibirFolhaPagamento();
                        System.out.println("---------------------");
                    }
                    break;
                case 0:
                    opcao = 0;
                    break;
                default:
                    System.out.println("Você digitou uma opção, inválida. Retorne ao menu principal.");
                    continue;
            }
        }
        scanner.close();
    }
        public static int lerInteiroPositivo(Scanner scanner, String mensagem) {
            int valor;

            while (true) {
                System.out.println(mensagem);
                valor = scanner.nextInt();
                scanner.nextLine();

                if (valor >= 0) {
                    return valor;
                }

                System.out.println("Valor inválido. Digite novamente.");
            }
        }
        public static double lerRealPositivo(Scanner scanner, String mensagem) {
            double valor;

            while (true) {
                System.out.println(mensagem);
                valor = scanner.nextDouble();
                scanner.nextLine();

                if (valor >= 0) {
                    return valor;
                }

                System.out.println("Valor inválido. Digite novamente.");
            }
        }
        public static String lerNomeValido(Scanner scanner, String mensagem) {
            String nome;

            while (true) {
                System.out.println(mensagem);
                nome = scanner.nextLine();

                if (!nome.isBlank() && nome.matches("[a-zA-ZÀ-ÿ ]+")) {
                    return nome;
                }

                System.out.println("Nome inválido. Digite apenas letras.");
            }
        }
}

