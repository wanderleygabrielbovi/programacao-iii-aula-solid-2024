package br.edu.umfg.dip.refatorado;

public interface IEmailService {
    // Implementação concreta
    void enviarEmail(String remetente,
                     String destinatario,
                     String mensagem);
}
