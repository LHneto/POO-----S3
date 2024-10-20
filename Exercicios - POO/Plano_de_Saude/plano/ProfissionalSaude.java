package plano;

public class ProfissionalSaude {
    private String nome;
    private String especialidade;

    public ProfissionalSaude(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}
