package contabanco;

import java.util.Scanner;
import java.util.Random;

public class Conta {
    public int numConta;
    protected char tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public Conta(){         //Construtor
        this.saldo = 0;
        this.status = false;
    }
    public void info(){
        System.out.println("Numero da conta:" + getNumConta());
            System.out.println("Tipo de conta:" + getTipo());
                System.out.println("Dono da Conta:" + getDono());
                    System.out.println("Saldo da conta:" + getSaldo());
                        System.out.println("Status da Conta:" + isStatus());
    }
    
    public void abrirConta(){
        if(isStatus() == true)
            System.out.println("Erro... Conta aberta!");
        else {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Digite o nome do dono da conta:");
                setDono(sc1.nextLine());
            
            Random gerador = new Random();
            setNumConta(gerador.nextInt(101));
            System.out.println("O numero da sua conta é "+ getNumConta());
            
            System.out.println("qual será o tipo da conta?\nC para corrente\nP para poupança");
                String s = sc1.nextLine();
                setTipo(s.charAt(0));
            setStatus(true);
        }
    }
    
    public void fecharConta() {
        if(isStatus() == false)
            System.out.println("Erro...Conta fechada!");
        else {
            if(getSaldo() < 0)
                System.out.println("Erro...Conta não pode ser fechada pois o cliente está devendo");
            else 
                setStatus(false);
        }
    }
    
    public void depositar() {
        System.out.println("Quando você deseja depositar?");
            Scanner sc3 = new Scanner(System.in);
            setSaldo(getSaldo() + sc3.nextFloat());
        System.out.println("Seu saldo atual é "+ this.getSaldo());
    }
    
    public void sacar() {
        System.out.println("Quanto você deseja sacar?");
            Scanner sc4 = new Scanner(System.in);
            float f = sc4.nextFloat();
            if(f > getSaldo())
                System.out.println("Erro...Saldo insuficiente");
            else {
                setSaldo(getSaldo() - f);
                System.out.println("Seu saldo atual é "+ this.getSaldo());
            }
    }
    
    public void pagarMensal() {
        if(getSaldo() > 10)
            setSaldo(getSaldo() - 10);
        else{
            System.out.println("Sua Conta será fechada pois não tem fundos para a manutenção");
            fecharConta();
        }
    }   
    
    /*Getters e setters*/

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }  
}
