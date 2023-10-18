package testeclasses;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void rabiscar(){
    if(this.tampada == true){
        System.out.println("Erro");
    }
    else
            System.out.println("Estou rabiscando\n");
    }
    
    void tampar() {
    this.tampada = true;
    }
    
    void destampar() {
    this.tampada = false;
    }
    
    void status() {
            System.out.println("modelo: " + this.modelo);
            System.out.print("Uma caneta " + this.cor);
            System.out.println("Ponta: " + this.ponta);
            System.out.println("Carga:" + this.carga);
            System.out.println("está tampada? " + this.tampada);
            System.out.println("\n");
    }
}
