package com.planoSaude;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
       
        Pessoa titular = new Pessoa("João Silva", "Rua A", new Date(1990 - 1900, 5, 15), "Masculino", 350.0);
        
        Contrato contrato = new Contrato(12345, new Date(), titular);

        Pessoa dependente = new Pessoa("Maria Silva", "Rua A", new Date(2000 - 1900, 7, 20), "Feminino", 150.0);
        contrato.incluirDependente(dependente);

        Fatura fatura = contrato.gerarFatura();
        System.out.println("Valor total da fatura: " + fatura.getValorTotal());
    }
}
