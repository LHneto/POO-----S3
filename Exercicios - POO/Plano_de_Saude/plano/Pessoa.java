package plano;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pessoa {
    private String nome;
    private String endereco;
    private Date dataNascimento;
    private String sexo;
    private double valorTarifa;
    private List<ConsultaExame> historicoConsultasExames;

    public Pessoa(String nome, String endereco, Date dataNascimento, String sexo, double valorTarifa) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.valorTarifa = valorTarifa;
        this.historicoConsultasExames = new ArrayList<>();
    }

    public void adicionarHistorico(ConsultaExame consultaExame) {
        historicoConsultasExames.add(consultaExame);
    }

    public String getNome() {
        return nome;
    }

    public double getValorTarifa() {
        return valorTarifa;
    }

    public List<ConsultaExame> getHistoricoConsultasExames() {
        return historicoConsultasExames;
    }
}
