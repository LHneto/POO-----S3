package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PessoaDAO {
    public void salvar(Pessoa p) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("pessoas.txt", true))) {
            writer.write(p.getNome());
            writer.newLine();
            System.out.println("Pessoa salva com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao salvar a pessoa: " + e.getMessage());
        }
    }
}
