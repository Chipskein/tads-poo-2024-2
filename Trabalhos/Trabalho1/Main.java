import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaReservas sistema = new SistemaReservas();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("===== Menu Principal =====");
            System.out.println("1. Adicionar Novo Hotel");
            System.out.println("2. Listar Todos os Hotéis");
            System.out.println("3. Adicionar Quarto a um Hotel");
            System.out.println("4. Listar Quartos Disponíveis em um Hotel");
            System.out.println("5. Fazer Reserva");
            System.out.println("6. Cancelar Reserva");
            System.out.println("7. Listar Reservas de um Cliente");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Gambers: nextInt -> não consome a quebra de linha
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do hotel: ");
                    var nome=scanner.nextLine();
                    System.out.println("Digite o endereço do hotel: ");
                    var endereco=scanner.nextLine();
                    sistema.adicionarHotel(nome,endereco);
                    break;
                case 2:
                    sistema.listarHoteis();
                    break;
                case 3:
                    System.out.println("Digite o nome do hotel: ");
                    var nomeHotel=scanner.nextLine();
                    System.out.println("Digite o número do quarto: ");
                    var numero=scanner.nextLine();
                    System.out.println("Digite o tipo do quarto(SIMPLES,FAMILIAR,EXECUTIVO,CASAL): ");
                    var tipo=scanner.nextLine();
                    System.out.println("Digite o preço do quarto: ");
                    var preco=scanner.nextFloat();
                    scanner.nextLine(); // Gambers: nextFloat -> não consome a quebra de linha
                    sistema.adicionarQuarto(nomeHotel,numero,TipoQuarto.valueOf(tipo.toUpperCase()),preco);
                    break;
                case 4:
                    sistema.listarQuartosDisponiveis();
                    break;
                case 5:
                    sistema.fazerReserva();
                    break;
                case 6:
                    sistema.cancelarReserva();
                    break;
                case 7:
                    sistema.listarReservasCliente();
                    break;
                case 8:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            
        } while (opcao != 8);

        scanner.close();
    }
}