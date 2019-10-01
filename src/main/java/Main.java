import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vecesTirar, max = 6, min = 1;
        int range = max - min + 1;
        int dado1, dado2, dadoT;
        int lista[] = new int[11];
        System.out.println("¿Cuantas veces quieres tirar?");
        vecesTirar = sc.nextInt();
        System.out.println(vecesTirar);

        for (int i = 0; i < vecesTirar; i++) {
            dado1 = (int) (Math.random() * range) + min;
            dado2 = (int) (Math.random() * range) + min;
            dadoT = (dado1 + dado2) - 2;
            lista[dadoT]++;
        }

        for (int i = 0; i < lista.length; i++) {
            System.out.println(i+2 + " Se repite: " + lista[i]);
        }

    }
}
