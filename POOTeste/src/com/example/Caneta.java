package com.example;

public class Caneta {
    public String modelo;
    public String cor;
    protected float ponta;
    public int carga;
    private boolean tampada;

    public Caneta(String m, String cr){  //Método construtor
        this.tampada = false;
        this.modelo = "BIC Crystal";
        this.cor = "Azul";
        this.carga = 100;
    }

    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro\n");
        }
        else
            System.out.println("Estou rabiscando\n");
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public void status() {
        System.out.println("modelo: " + this.getModelo());
        System.out.print("Uma caneta " + this.getCor());
        System.out.println(" Ponta: " + this.getPonta());
        System.out.println("Carga: " + this.getCarga());
        System.out.println("está tampada? " + this.isTampada());
    }
    //Métodos especiais:

    //Método getter
    public String getModelo(){
        return this.modelo;
    }
    //Método setter
    public void setModelo(String m){
        this.modelo = m;
    }


    //Método getter
    public String getCor(){
        return this.cor;
    }
    //Método setter
    public void setCor(String cr){
        this.cor = cr;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    public int getCarga() {
        return carga;
    }

    public float getPonta() {
        return ponta;
    }
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }
    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

}