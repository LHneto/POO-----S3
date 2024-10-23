package plano;

import java.util.Date;

public class ConsultaExame {
    private String tipo; 
    private Date data;
    private String descricao;
    private ProfissionalSaude profissional;

    public ConsultaExame(String tipo, Date data, String descricao, ProfissionalSaude profissional) {
        this.tipo = tipo;
        this.data = data;
        this.descricao = descricao;
        this.profissional = profissional;
    }

    public String getTipo() {
        return tipo;
    }

    public ProfissionalSaude getProfissional() {
        return profissional;
    }
}

