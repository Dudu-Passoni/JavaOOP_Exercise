public class Main {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();  não é possivel pois é uma classe abstrata
        Visitante v1 = new Visitante();
        v1.setIdade(25);

        Aluno a1 = new Aluno();
        a1.setNome("Jose");
        a1.setMatricula(1542);
        a1.setCurso("Engenharia");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("Bruno");
        b1.pagarMensalidade();
    }
}