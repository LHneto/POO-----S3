package plano;

import java.util.Date;

public class Fatura {
    private double valorTotal;
    private Date dataVencimento;
    private double percentualMulta;
    private double jurosPorDia;

    public Fatura(double valorTotal, Date dataVencimento, double percentualMulta, double jurosPorDia) {
        this.valorTotal = valorTotal;
        this.dataVencimento = dataVencimento;
        this.percentualMulta = percentualMulta;
        this.jurosPorDia = jurosPorDia;
    }

    public double calcularMulta() {
        return valorTotal * percentualMulta;
    }

    public double calcularJuros(long diasAtraso) {
        return valorTotal * jurosPorDia * diasAtraso;
    }

    // Getters e Setters
    public double getValorTotal() {
        return valorTotal;
    }
}
