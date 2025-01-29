package view;

import java.util.Scanner;
import model.Pessoa;
import controller.CtrlPessoa;

public class CadPessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();
        
        Pessoa pessoa = new Pessoa(nome);
        CtrlPessoa ctrlPessoa = new CtrlPessoa();

        try {
            ctrlPessoa.salvar(pessoa);
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
