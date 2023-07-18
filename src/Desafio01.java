import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Desafio01 {

    public static void main(String[] args) {

        List<Integer> valores = new ArrayList();
        List<Integer> valoresPares = new ArrayList();
        List<Integer> valoresImpares = new ArrayList();

        Scanner sc = new Scanner(System.in);
        int qtd = sc.nextInt();

        for(int i=0;i<qtd;i++){
            valores.add(sc.nextInt());
        }

        for (int valor : valores) {
            if( valor%2 == 0 ){
                valoresPares.add(valor);
            }else{
               valoresImpares.add(valor);
            }
        }

        Collections.sort(valoresPares);
        Collections.reverse(valoresImpares);

        for (int valor : valoresPares){
            System.out.println(valor);
        }

        for (int valor : valoresImpares){
            System.out.println(valor);
        }

    }

}
