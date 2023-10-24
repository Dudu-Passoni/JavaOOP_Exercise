package contabanco;

import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.info();
        c1.abrirConta();
        c1.info();
        c1.depositar();
        c1.depositar();
        c1.sacar();
        c1.info();
    }
    
}
