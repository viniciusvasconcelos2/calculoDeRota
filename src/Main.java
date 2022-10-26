import calculoRotas.dominio.Ponto;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public  static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o número de pontos que vai querer");
        int N = teclado.nextInt();
        Ponto ponto = new Ponto();
        Map<Integer,Long> mapaPonto = new HashMap<>();
        for(int i =0; i<N;i++) {

            System.out.println("digite o número do pacote");
            ponto.setNumeroPacote(teclado.nextInt());
            System.out.println("digite o CEP sem o traço");
            ponto.setCEP(teclado.nextLong());
            mapaPonto.put(ponto.getNumeroPacote(), ponto.getCEP());

        }
        System.out.println(mapaPonto);
    }
}
