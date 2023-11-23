public class Main {
    public static void main(String[] args) {
        Gato c = new Gato(7, 2, "Siames");
        Cachorro c1 = new Cachorro(20, 4, "Preto");
        c.emitirSom();  // Polimorfismo de Sobreposição
        c1.emitirSom(); // Polimorfismo de Sobreposição

        c.reagir(19);               //Polimorfismo de Sobrecarga
        c.reagir("Fazer carinho");  //Polimorfismo de Sobrecarga
    }
}