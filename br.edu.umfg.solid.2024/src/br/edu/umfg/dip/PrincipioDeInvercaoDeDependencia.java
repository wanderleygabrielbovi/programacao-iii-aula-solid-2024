package br.edu.umfg.dip;

import br.edu.umfg.dip.legado.UserService;
import br.edu.umfg.dip.refatorado.EmailServiceRefatorado;
import br.edu.umfg.dip.refatorado.IEmailService;
import br.edu.umfg.dip.refatorado.UserServiceRefatorado;

public class PrincipioDeInvercaoDeDependencia {
    public static void executarLegado(){
        UserService userService = new UserService();
        userService.registrarUsuario("teste1@gmail.com");
    }

    // Uso da classe UserServiceRefatorado com
    // injeção/inversão de dependência
    public static void executarRefatorado(){
        IEmailService emailService = new EmailServiceRefatorado();

        /*
         * A classe de alto nível UserServiceRefatorado depende de
         * uma abstracao (interface IEmailService) em vez da implementacao
         * (classe concreta EmailServiceRefatorado)
         * A classe de baixo nível EmailServiceRefatorado implementa a
         * abstracao (interface IEmailService), isso permite maior
         * flexibilidade e substituicao (por isso inversão de dependências)
         */
        UserServiceRefatorado usuarioService = new UserServiceRefatorado(emailService);

        usuarioService.registrar("teste2@gmail.com");
    }
}
