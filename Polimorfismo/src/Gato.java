public class Gato extends Mamifero{

    public void ronronar(){
        System.out.println("rrrrrrrrrrr...");
    }

    public void reagir(int hora){
        if(hora > 18 && hora < 24)
            System.out.println("O gato está caçando -_-");
    }

    public void reagir(String acao){
        if(acao == "Fazer carinho")
            ronronar();
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    public Gato(float peso, int idade, String corPelo) {
        super(peso, idade, corPelo);
    }
}
