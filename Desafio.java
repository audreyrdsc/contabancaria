import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcaoEscolhida = 0;
        String nomeCliente;
        double saldoInicial = 0;
        double valorRecebido = 0;
        double valorTransferido = 0;

        System.out.println("Digite o nome do cliente: ");
        nomeCliente = leitura.nextLine();

        System.out.println("Digite o saldo inicial: ");
        saldoInicial = leitura.nextDouble();

        String menu =   """
                            Operações:
                            1 - Consultar saldo
                            2 - Receber valor
                            3 - Transferir valor
                            4 - Sair
                        
                            Digite a opção desejada:
                        """;

        while (opcaoEscolhida != 4) {
            System.out.println("\n***********************");
            System.out.println("Dados iniciais do cliente:");
            System.out.println("Nome: " + nomeCliente);
            System.out.println("Saldo: R$ " + saldoInicial );
            System.out.println("***********************\n");
            System.out.println(menu);
            opcaoEscolhida = leitura.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    System.out.println("Seu saldo atualizado é de R$ " + saldoInicial);
                    break;
                case 2:
                    System.out.println("Digite o valor recebido");
                    valorRecebido = leitura.nextDouble();
                    if (valorRecebido >0) {
                        saldoInicial += valorRecebido;
                    } else {
                        System.out.println("Valor recebido é inválido!\n");
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor a ser transferido");
                    valorTransferido = leitura.nextDouble();
                        if (valorTransferido <= saldoInicial) {
                            System.out.println("Operação realizada com sucesso!\n");
                            saldoInicial -= valorTransferido;
                        } else {
                            System.out.println("Saldo de R$ %.2f é insuficiente para a transferência de R$ %.2f\n".formatted(saldoInicial, valorTransferido));
                        }
                    break;
                case 4:
                    System.out.println("\nObrigado por utilizar nossos serviços!");
                    break;
                default:
                    System.out.println("Opção inválida\n");
                    break;

            }
        }
    }
}
