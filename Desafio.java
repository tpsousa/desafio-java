import java.util.Scanner;

public class Desafio {
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;
        
//código omitido

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - Sair

                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
          System.out.println(menu);
          opcao = leitura.nextInt();

          if(opcao==1){
            System.out.println("o saldo disponivel e: " + saldo);
          }else if (opcao == 2){
              System.out.println("qual quantidade quer transferir");
              double quantidade = leitura.nextDouble();

              if(saldo >= quantidade){
                saldo -= quantidade;

                System.out.println("novo saldo: "  +saldo);
              }else{
                System.out.println("transferencia negada,saldo insuficiente");
              }
          }else if(opcao==3){
            System.out.println("valor recebido: ");
            double valor = leitura.nextDouble();
            saldo += valor;
            System.out.println("novo saldo" + saldo);
          }else if(opcao != 4){
            System.out.println("Opcao invalida");
          }
        }
    }
}