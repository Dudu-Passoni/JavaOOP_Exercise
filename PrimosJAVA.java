package primosjava;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimosJAVA {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
       // int lista[] = new int[100];
       ArrayList<Integer> lista = new ArrayList<Integer>();
        int k = 0;
        
        System.out.println("Bem-Vindo!!!  \n\nDigite o número que você deseja calcular os primos:");
        int num = teclado.nextInt();
        
        for(int j=num;j>1;j--){
            for(int i=2;i<num;i++){
                if(num % i == 0){
                    //System.out.println(num +" não é primo, ");
                    //lista[k] = num;
                    num--;
                    break;
                } 
                else if(i == num-1){ 
                    lista.add(num);
                    k++;
                    num--;
                }
            } 
        }
        System.out.println(lista);
        }
    }
    
