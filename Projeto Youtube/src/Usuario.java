public class Usuario extends Pessoa{
    private String login;
    private int totAssistido;

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

    public Usuario(String nome, int idade, char sexo, String login) {
        super(nome, idade, sexo);
        this.totAssistido = 0;
    }
}
