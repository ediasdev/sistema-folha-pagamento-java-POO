# Sistema de Folha de Pagamento em Java

Projeto desenvolvido em Java com foco em Programação Orientada a Objetos (POO), utilizando conceitos como herança, polimorfismo, sobrescrita de métodos e coleções com ArrayList.

## Objetivo

Desenvolver um sistema simples de folha de pagamento capaz de cadastrar diferentes tipos de funcionários e calcular seus salários finais de acordo com suas características específicas.

---

# Funcionalidades

- Cadastro de Funcionário Padrão
- Cadastro de Funcionário Comissionado
- Cadastro de Funcionário Produção
- Geração de folha de pagamento
- Cálculo automático de salário final
- Validação de entradas de dados
- Controle de funcionários utilizando ArrayList
- Menu interativo no terminal

---

# Conceitos de POO utilizados

## Herança
As classes específicas de funcionários herdam atributos e métodos da classe mãe `Funcionario`.

## Polimorfismo
Cada tipo de funcionário possui sua própria implementação do método de cálculo salarial.

## Sobrescrita de métodos (`@Override`)
Os métodos foram sobrescritos nas subclasses para alterar o comportamento do cálculo salarial.

## Encapsulamento parcial
Os atributos foram organizados respeitando responsabilidades entre classes.

---

# Estrutura do Projeto

```text
src/
└── folha_de_pagamento_basico/
    ├── Main.java
    ├── Funcionario.java
    ├── FuncionarioPadrao.java
    ├── FuncionarioComissionado.java
    └── FuncionarioProducao.java    