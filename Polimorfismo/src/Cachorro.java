public class Cachorro extends Mamifero{
    public void abanarRabo(){
        System.out.println("Abanando o rabo!");
    }
    public void enterrarOsso(){
        System.out.println("Enterrando osso!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au!");
    }
    //Especiais


    public Cachorro(float peso, int idade, String corPelo) {
        super(peso, idade, corPelo);
    }
}
