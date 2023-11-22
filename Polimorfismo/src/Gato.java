public class Gato extends Mamifero{

    public void ronronar(){
        System.out.println("rrrrrrrrrrr...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    public Gato(float peso, int idade, String corPelo) {
        super(peso, idade, corPelo);
    }
}
