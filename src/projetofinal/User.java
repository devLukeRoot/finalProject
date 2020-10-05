package projetofinal;

public class User extends Pessoa {

private String login;
private int totAssistido;

    public User(String login, String nome, String sexo, int idade) {
        super(nome, sexo, idade);
        this.login = login;
        this.totAssistido = 0;
    }
        
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "User{" + super.toString()+ "\nlogin=" + login + ", totAssistido=" + totAssistido + '}';
    }
  
    
}
