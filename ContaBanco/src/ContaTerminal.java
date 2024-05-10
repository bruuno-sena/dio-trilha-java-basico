import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
      //TODO: Conhecer e importar a classe Scanner
      
      //Criando o objeto scanner
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       while (true) {
        System.out.println("Por favor, digite o seu Nome!");
        String nome = scanner.nextLine();

        nome = nome.replaceAll("[^a-zA-Z ]", "");      

        String agencia = "";

        while (true) {
            System.out.println("Por favor, digite o número da Agência (formato 000-0):");
            agencia = scanner.next();
        
            // Remove os caracteres não numéricos
            agencia = agencia.replaceAll("[^0-9]", "");
        
            // Verifica se a agência tem o comprimento correto
            if (agencia.length() != 4) {
                System.out.println("Formato de agência inválido. Por favor, digite no formato 000-0.");
            } else {
                // Aplica a máscara 000-0
                agencia = agencia.substring(0, 3) + "-" + agencia.substring(3);
                break; // Sai do loop se a entrada for válida
            }
        }

        System.out.println("Por favor, digite o número da sua Conta!");
        String contaString = scanner.next();     
          
        contaString = contaString.replaceAll("[^0-9]", "");
        int conta = Integer.parseInt(contaString);

        System.out.println("Por favor, digite o valor a ser depositado em sua conta!");
        String saldoString = scanner.next();        

        saldoString = saldoString.replaceAll("[^0-9,]", "");
        saldoString = saldoString.replace(',', '.');

        double saldo = Double.parseDouble(saldoString);

        scanner.nextLine();

        // Exibe os dados inseridos e solicita confirmação
        System.out.println("\nConfirma os dados inseridos:");
        System.out.println("NOME: " + nome.toUpperCase());
        System.out.println("AGÊNCIA: " + agencia);
        System.out.println("CONTA: " + conta);
        System.out.println("SALDO: " + saldo);

        // Solicita ao usuário que confirme ou edite os dados
        System.out.println("\nDigite 'S' para confirmar ou qualquer outra tecla para editar:");
        String confirmacao = scanner.nextLine();

        if (confirmacao.equalsIgnoreCase("S")) {
            System.out.println("Olá " + nome.toUpperCase() + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia+ ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
            break; 
        } else {
            System.out.println("Editando os dados...");
            //Será reiniciado a edição dos dados inseridos anteriromente
        }

        }
    }

}

