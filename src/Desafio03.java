import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList();
        int k = 0;
        int qtd = sc.nextInt();
        int alvo = sc.nextInt();

        for(int i=0;i<qtd;i++){
            arr.add(sc.nextInt());
        }

        for (int i=0; i<arr.size(); i++){
            for (int x=0; x<arr.size(); x++){
                int val = arr.get(i)-arr.get(x);
                if(val==alvo){
                    k+=1;
                }
            }
        }

        System.out.println(k);
    }
}
