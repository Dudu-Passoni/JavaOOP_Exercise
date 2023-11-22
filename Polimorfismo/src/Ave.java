public class Ave extends Animal{
    private String corPena;
    public void fazerNinho(){
        System.out.println("||__||");
    }
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Bicando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Sons de Passaros!");
    }

    //Especiais

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public Ave(float peso, int idade, String corPena) {
        super(peso, idade);
        this.corPena = corPena;
    }
}
