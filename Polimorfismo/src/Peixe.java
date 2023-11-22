public class Peixe extends Animal{
    private String corEscamas;

    public void soltandoBolhas(){
        System.out.println("Soltando bolhas!");
    }
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo na água");
    }

    @Override
    public void emitirSom() {
        System.out.println("Blop");
    }

    //Especiais

    public String getCorEscamas() {
        return corEscamas;
    }

    public void setCorEscamas(String corEscamas) {
        this.corEscamas = corEscamas;
    }

    public Peixe(float peso, int idade, String corEscamas) {
        super(peso, idade);
        this.corEscamas = corEscamas;
    }
}
