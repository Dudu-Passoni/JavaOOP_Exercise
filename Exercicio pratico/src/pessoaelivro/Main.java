package pessoaelivro;

public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Alex", 34, 'M');
        p[1] = new Pessoa("Anna", 25, 'F');

        l[0] = new Livro("A Ordem", "Marcos de Paula", 354, p[0]);
        l[0].abrir();
        l[0].folhear(15);
        l[0].avancarPag();
        l[0].detalhes();
    }
}