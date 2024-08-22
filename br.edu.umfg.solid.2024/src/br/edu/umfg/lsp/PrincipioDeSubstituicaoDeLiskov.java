package br.edu.umfg.lsp;

import br.edu.umfg.lsp.legado.Aluno;
import br.edu.umfg.lsp.legado.AlunoEad;
import br.edu.umfg.lsp.refatorado.AbstractAluno;
import br.edu.umfg.lsp.refatorado.AlunoEadRefatorado;
import br.edu.umfg.lsp.refatorado.AlunoPresencialRefatorado;

public class PrincipioDeSubstituicaoDeLiskov {
    public static void executarLegado(){
        Aluno alunoUm =
                new Aluno("RA1", "TESTE 1");
        alunoUm.setNotaFinal(9.7);

        AlunoEad alunoDois
                = new AlunoEad("RAE1",
                "TESTE 2",
                "teste@email.com",
                "Teste@2024");
        alunoDois.setNotaFinal(6.1);

        System.out.println("RA | NOME | NOTA FINAL");
        System.out.println(alunoUm.getRa() +
                " | " + alunoUm.getNome() +
                " | " + alunoUm.getNotaFinal());
        System.out.println(alunoDois.getRa() +
                " | " + alunoDois.getNome() +
                " | " + alunoDois.getNotaFinal());
    }

    public static void executarRefatorado(){
        AlunoPresencialRefatorado alunoTres =
                new AlunoPresencialRefatorado("RA3",
                        "TESTE 3",
                        8.5);
        AlunoEadRefatorado alunoQuatro =
                new AlunoEadRefatorado("RAE4",
                        "TESTE 4",
                        9.2,
                        "teste4@email.com",
                        "Umfg@2024");

        System.out.println("RA | NOME | NOTA FINAL");
        imprimir(alunoTres);
        imprimir(alunoQuatro);
    }

    private static void imprimir(AbstractAluno aluno){
        System.out.println(aluno.getRa() + " | " +
                aluno.getNome() + " | " +
                aluno.getNotaFinal());
    }
}