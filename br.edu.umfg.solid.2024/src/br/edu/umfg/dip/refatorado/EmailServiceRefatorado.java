package br.edu.umfg.dip.refatorado;
// Implementação concreta
public class EmailServiceRefatorado implements IEmailService{
    @Override
    public void enviarEmail(String remetente,
                            String destinatario,
                            String mensagem) {
        System.out.println("De: " + remetente + "\n" +
                "Para: " + destinatario + "\n" +
                "Mensagem: " + mensagem);
    }
}
