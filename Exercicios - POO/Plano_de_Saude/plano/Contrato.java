package plano;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
    private int numeroContrato;
    private Date dataInicio;
    private Pessoa titular;
    private List<Pessoa> dependentes;
    private List<Fatura> faturas;

    public Contrato(int numeroContrato, Date dataInicio, Pessoa titular) {
        this.numeroContrato = numeroContrato;
        this.dataInicio = dataInicio;
        this.titular = titular;
        this.dependentes = new ArrayList<>();
        this.faturas = new ArrayList<>();
    }

    public void incluirDependente(Pessoa dependente) {
        dependentes.add(dependente);
    }

    public Fatura gerarFatura() {
        double valorTotal = titular.getValorTarifa();
        for (Pessoa dependente : dependentes) {
            valorTotal += dependente.getValorTarifa();
        }
        Fatura fatura = new Fatura(valorTotal, new Date(), 0.02, 0.001);
        faturas.add(fatura);
        return fatura;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public List<Pessoa> getDependentes() {
        return dependentes;
    }
}
