package testeclasses;

public class TesteClasses {

    public static void main(String[] args) {
       
       //criação de classes
        Caneta c1 = new Caneta("BIC", "vermelho");
        c1.setCor("vermelho");
        c1.setModelo("BIC Crystal");
        c1.ponta = 0.5f;
        c1.destampar();
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta("BIC", "azul");
        c2.ponta = 0.5f;
        c2.tampar();
        c2.status();
        c2.rabiscar();  
    }
    
}
