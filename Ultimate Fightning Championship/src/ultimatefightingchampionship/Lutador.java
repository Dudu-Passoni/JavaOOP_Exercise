package ultimatefightingchampionship;

public class Lutador {
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;

    public void apresentar(){
        System.out.println("Apresentando "+ this.getNome());
        System.out.println("Diretamente de "+ this.getNacionalidade());
        System.out.println("Ele possui: "+ this.getVitorias() + " Vitorias, " + this.getDerrotas() + " Derrotas e "+ this.getEmpates() + " Empates.");
        System.out.println("*********************************");
    }
    public void Status(){
        System.out.println("");
    }
    public void ganharluta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderluta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarluta(){
        this.setEmpates(this.getEmpates() + 1);
    }


    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso >52.2){
            this.categoria = "Invalido";
        }
        else if(this.peso <= 70.3){
            this.categoria = "Peso Leve";
        }
        else if(this.peso <= 83.9){
            this.categoria = "Peso Médio";
        }
        else if (this.peso <= 120.2){
            this.categoria = "Peso Pesado";
        }
        else
            this.categoria = "Invalido";
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
}
