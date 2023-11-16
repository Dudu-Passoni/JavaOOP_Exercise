package pessoaelivro;
public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual ;
    private boolean aberto;
    private Pessoa leitor;

    public void detalhes(){
        System.out.println("Título do Livro: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Está aberto? " + isAberto());
        System.out.println("Quantidade de Páginas: " + getTotPaginas());
        System.out.println("Página Atual: " + getPagAtual());
        System.out.println("Nome do Leitor: " + getLeitor().getNome());
    }

    //Setters e Getters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
//Construtor

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.leitor = leitor;
        this.pagAtual = 0;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
        setPagAtual(0);
    }

    @Override
    public void folhear(int p) {
        if(isAberto()) {
            if(this.totPaginas >= p)
        this.pagAtual = p;
            else
                System.out.println("Erro... Não possúi páginas suficiente");
        }
        else
            System.out.println("Erro... O livro está fechado");
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}