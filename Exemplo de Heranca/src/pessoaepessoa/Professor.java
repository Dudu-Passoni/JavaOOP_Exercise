package pessoaepessoa;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public void aumento(float aum){
        setSalario(getSalario()+ aum);
    }


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Professor(String nome, int idade, char sexo, String especialidade, float salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public Professor(){
    }


}
