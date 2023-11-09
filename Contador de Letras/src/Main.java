import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        char letra;
        String frase = "teste testando testilson";
        int[] frequencia = new int[26];

        frase = frase.toLowerCase();


        for (int i = 0; i < frase.length(); i++) {
            letra = frase.charAt(i);
            if (letra >= 'a' && letra <= 'z') {
                frequencia[letra - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if(frequencia[i] != 0)
                System.out.println((char) ('a' + i) + "= " + frequencia[i]);

        }
    }
}