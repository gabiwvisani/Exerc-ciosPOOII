package Solid;
/*
    Versão errada sem usar SOLID

Percebe-se que essa classe deverá ser alterada se:
* Os usuários receberem um novo atributo;
* O cliente de banco de dados mudar;
* O cliente de email for alterado;
* O calculo do CPF sejá diferente

Nesse exemplo, mexer na nossa classe porque tem um novo atributo está correta (1º motivo para mudar), porém se o banco de dados mudar também temos que alterar nossa classe (2º motivo para mudar)
também se a forma como enviamos SMS mudar é outro motivo para mudar nossa classe (3º motivo) - percebe que temos mais de um motivo para mudar? Sobre isso que trata o `SRP`, a classe só pode ser alterada por um único motivo.

    public class User {
    private String name;
    private String email;
    private String cpf;

    // Métodos de acesso (getters/setters)

    public void saveUser() {
        // Salva o usuário no banco de dados
        // Esta é uma violação do SRP, pois a classe User também está lidando com a persistência dos dados
    }

    public void sendEmail(String message) {
        // Envia um e-mail para o usuário
        // Esta é outra violação do SRP, pois User também está lidando com comunicação por e-mail
    }

   public void sendSMS(String message) {
      // Envia um SMS para o usuário
      // Esta é outra violação do SRP, pois User também está lidando com comunicação por SMS
   }

   public boolean isValidCPF() {
      // Faz o calculo para verificar se o CPF é valido
      // Esta é mais uma violação do SRP, pois User também tem que saber o calculo do CPF.
   }
}*/

public class User {
    private String name;
    private String email;

    // Métodos de acesso (getters/setters)
}

