import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio04 {

    public static void main(String[] args) {

        List<String> valores = new ArrayList();

        Scanner sc = new Scanner(System.in);
        int qtd = Integer.parseInt(sc.nextLine());

        for(int i=0;i<qtd;i++){
            valores.add(sc.nextLine());
        }

        for(String valor : valores){
            int tamanho = valor.length();
            int metade = tamanho/2;

            String val1 = new StringBuilder(valor.substring(0,metade)).reverse().toString();
            String val2 = new StringBuilder(valor.substring((metade))).reverse().toString();
            System.out.println(val1+val2);
        }
    }



}
