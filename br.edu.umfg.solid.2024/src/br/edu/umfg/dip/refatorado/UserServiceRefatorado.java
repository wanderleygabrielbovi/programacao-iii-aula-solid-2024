package br.edu.umfg.dip.refatorado;

public class UserServiceRefatorado {
    private final String DEFAULT_EMAIL = "minha.empresa@gmail.com";
    private IEmailService emailService;

    // Classe de alto nível com recebe injeção/inversão
    // de dependência via método construtor
    public UserServiceRefatorado(IEmailService emailService) {
        this.emailService = emailService;
    }
    public void registrar(String email){
        String mensagem = "Bem vindo. Você foi registrado!";
        this.emailService.enviarEmail(DEFAULT_EMAIL, email, mensagem);
    }
}
