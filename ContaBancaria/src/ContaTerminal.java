import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        System.out.println("--- Bem Vindo ao Banco --- ");

        Scanner sc = new Scanner(System.in);

        double saldo = 237.48; // Aqui coloquei um saldo fixo, só para representar o saldo da conta do cliente.

        System.out.println("Por favor digite o numero da conta: ");
        var numeroConta = sc.nextInt();

        sc.nextLine();

        System.out.println("Por favor digite a agencia: ");
        String agencia = sc.nextLine();



        System.out.println("Por favor digite o seu nome: ");
        var nomeCliente = sc.nextLine();

        sc.close();


        System.out.printf("Olá [%s], obrigado por criar uma conta em nosso banco, sua agência é [%s], conta [%d] e seu saldo [%.2f] já está disponível para saque", nomeCliente,agencia,numeroConta,saldo);
    }
}
