import java.text.SimpleDateFormat;
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
            System.out.println("8. Registrar Cliente");
            System.out.println("9. Listar Clientes");
            System.out.println("10. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Gambers: nextInt -> não consome a quebra de linha
            try {
            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o nome do hotel: ");
                    var nome=scanner.nextLine();
                    System.out.println("Digite o endereço do hotel: ");
                    var endereco=scanner.nextLine();
                    sistema.adicionarHotel(nome,endereco);
                }
                case 2 -> sistema.listarHoteis();
                case 3 -> {
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
                }
                case 4 -> {
                    System.out.println("Digite o nome do hotel: ");
                    String nomeHotel = scanner.nextLine();
                    sistema.listarQuartosDisponiveis(nomeHotel);
                }
                case 5 -> {
                    System.out.println("Digite o nome do hotel: ");
                    String nomeHotel = scanner.nextLine();
                    System.out.println("Digite o numero do quarto: ");
                    var numeroQuarto=scanner.nextLine();
                    System.out.println("Digite o email do cliente: ");
                    var emailCliente=scanner.nextLine();
                    System.out.println("Digite a data de inicio da reserva(yyyy-MM-dd): ");
                    var dataInicioStr=scanner.nextLine();
                    var dataInicio = new SimpleDateFormat("yyyy-MM-dd").parse(dataInicioStr);
                    System.out.println("Digite a data do fim da reserva(yyyy-MM-dd): ");
                    var dataFimStr=scanner.nextLine();
                    var dataFim = new SimpleDateFormat("yyyy-MM-dd").parse(dataFimStr);
                    sistema.fazerReserva(nomeHotel,numeroQuarto,emailCliente,dataInicio,dataFim);
                }
                case 6 -> {
                    String reservaId = scanner.nextLine();
                    System.out.println("Digite o id da reserva: ");
                    sistema.cancelarReserva(reservaId);
                }
                case 7 -> {
                    System.out.println("Digite o email do cliente: ");
                    String emailCliente = scanner.nextLine();
                    sistema.listarReservasCliente(emailCliente);
                }
                case 8 -> {
                    System.out.println("Digite o nome do cliente: ");
                    var nome=scanner.nextLine();
                    System.out.println("Digite o email do cliente: ");
                    var email=scanner.nextLine();
                    System.out.println("Digite o telefone do cliente: ");
                    var telefone=scanner.nextLine();
                    sistema.registrarCliente(nome,email,telefone);
                }
                case 9 -> sistema.listarClientes();
                case 10 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } while (opcao != 10);

        scanner.close();
    }
}