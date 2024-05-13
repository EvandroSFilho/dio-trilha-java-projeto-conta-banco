import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO:Conhecer e importar a classe Scanner
        // Exibir as mensagens para o nosso usuário
        // Obter pela scanner os valores digitados no terminal
        // Exibir a mensagem conta criada

        // criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digete seu nome: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        // imprimindo os dados obtidos pelo usuario
        System.out.println("---------------------------");
        System.out.println(
                "Olá, " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco. Sua agência é "
                        + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
