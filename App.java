import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Criação do Loop

        while (true) {
            System.out.println("Olá! Seja bem vindo ao nosso app!");
            System.out.println();
            System.out.println("Deseja fazer o seu cadastro? (S/N)");
            String cada = scanner.next();
            
         // Caso o usuário queira fazer o cadastro

            if (cada.equalsIgnoreCase("S")) {
                System.out.println("Ótimo, vamos fazer o nosso cadastro.");
                System.out.println();

                System.out.println("Defina seu nome de usuário:");
                String nome = scanner.next();
                System.out.println();

                System.out.println("Ótimo, agora defina sua senha:");
                int senha = scanner.nextInt();

                System.out.println("Cadastro realizado com sucesso!");
                System.out.println();

                System.out.println("Olá " + nome + ", coloque sua senha para continuar:");
                int login = scanner.nextInt();

                    if (login == senha) {
                        System.out.println("Ótimo! Agora você tem acesso a todos os nossos serviços.");
                    } else {
                        System.out.println("Senha incorreta! Refaça seu cadastro para trocar de senha.");
                    }
                    break;

            // Caso o usuário não queria fazer o cadastro

            } else if (cada.equalsIgnoreCase("N")) {
                System.out.println("Desculpe, você não pode continuar sem o cadastro");
                break;
               
            // Caso o usuário coloque uma opção inválida

            } else {
                System.out.println("Opção inválida!");
            }
        }
        
        scanner.close(); 
    }
}
