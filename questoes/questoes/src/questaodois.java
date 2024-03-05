import java.util.Scanner;

public class questaodois {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (verificarSePertenceASequencia(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean verificarSePertenceASequencia(int numero) {
        int primeiro = 0;
        int segundo = 1;

        while (segundo <= numero) {
            if (segundo == numero) {
                return true;
            }
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        return false;
    }
}
