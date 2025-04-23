package application;
import java.util.Scanner;

public class ValidadorCpf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu CPF (somente números): ");
        String cpf = scanner.nextLine();

        if (validarTamanhoCpf(cpf)) {
            System.out.println("Bem vindo(a)!");
        } else {
            System.out.println("Tente novamente mais tarde.");
        }

        scanner.close();
    }

    public static boolean validarTamanhoCpf(String cpf) {
        return cpf != null && cpf.length() == 11 && cpf.matches("\\d{11}");
    }
}
	