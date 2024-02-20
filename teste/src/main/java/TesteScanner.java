import java.util.Scanner;

public class TesteScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        Integer idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite a região onde mora: ");
        String endereco = sc.nextLine();

        System.out.println("Digite a empresa onde trabalha: ");
        String trabalho = sc.nextLine();

        System.out.println(String.format("Olá, meu nome é %s e tenho %d anos. Moro em %s e atualmente estou estagiando na %s.",
                nome, idade, endereco, trabalho));
    }
}
