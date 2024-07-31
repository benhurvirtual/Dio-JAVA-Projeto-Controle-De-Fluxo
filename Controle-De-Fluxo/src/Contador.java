import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (var terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro:");
            var parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo parâmetro:");
            var parametroDois = terminal.nextInt();

            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        var contagem = parametroDois - parametroUm;

        for (var i = 1; i <= contagem; i++) {
            System.out.println(String.format("Imprimindo o número %d", i));
        }
    }
}
