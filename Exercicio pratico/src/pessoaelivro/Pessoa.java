package pessoaelivro;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;

    public void fazerAniver(){
        setIdade(getIdade()+1);
    }
    //Setters e Getters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    //Construtor


    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
    }
}
