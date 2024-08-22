package br.edu.umfg.dip.legado;
// Classe de alto nível
public class UserService {
    private final String DEFAULT_EMAIL = "minha.empresa@email.com";
    private EmailService emailService;
    /*
    * A classe de alto nível UserService depende diretamente
    * da classe de baixo nível EmailService.
    * Isso cria um acoplamento rigido e dificulta a substituição
    * do EmailService por outra implementação
     */
    public UserService() {
        this.emailService = new EmailService(); // Dependencia direta;
    }
    public void registrarUsuario(String email){
        String mensagem = "Bem vindo! Você foi registrado!";
        this.emailService.enviarEmail(DEFAULT_EMAIL, email, mensagem);
    }
}
