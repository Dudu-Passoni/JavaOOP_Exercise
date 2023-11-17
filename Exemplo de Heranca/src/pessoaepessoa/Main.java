package pessoaepessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Luis", 25, 'M');
        Aluno p2 = new Aluno("Jose", 35, 'M', 12354, "Engenharia Eletrica");
        Professor p3 = new Professor();

        p3.aumento(50);
    }
}