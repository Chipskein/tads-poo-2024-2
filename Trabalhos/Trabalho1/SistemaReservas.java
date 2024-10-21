import java.util.Date;
public class SistemaReservas{
    private Administrador administrador;
    public SistemaReservas(){
        this.administrador = new Administrador("Administrador");
    }
   
    
    public void adicionarHotel(String nome, String endereco){
        var hotel=new Hotel(nome, endereco);
        if (administrador.procuraPeloNomeDoHotel(nome) != null) {
            System.out.println("Hotel já cadastrado. utilize outro nome.");
            return;
        }
        administrador.adicionarHotel(hotel);
    }
    
    public void listarHoteis(){
        var hoteis = administrador.listarHoteis();
        if (hoteis.isEmpty()) {
            System.out.println("Nenhum hotel cadastrado.");
            return;
        }
        for (Hotel hotel : hoteis) {
            System.out.println("===== Hotel =====");
            System.out.println("Nome: " + hotel.getNome());
            System.out.println("Endereço: " + hotel.getEndereco());
            System.out.println("==================");
        }
    }
    
    public void adicionarQuarto(String nomeHotel,String numero,TipoQuarto tipoQuarto, float preco){
        var hotel=administrador.procuraPeloNomeDoHotel(nomeHotel);
        if (hotel == null) {
            System.out.println("Hotel não encontrado.");
            return;
        }
        var quartoExiste=hotel.procurarQuarto(numero)!=null;
        if (quartoExiste) {
            System.out.println("Quarto já cadastrado. utilize outro número.");
            return;
        }
        hotel.adicionarQuarto(new Quarto(numero, tipoQuarto, preco));
        System.out.println("Hotel não encontrado.");
    }
    
    public void listarQuartosDisponiveis(String nomeHotel ){
        var hotel=administrador.procuraPeloNomeDoHotel(nomeHotel);
        if (hotel == null) {
            System.out.println("Hotel não encontrado.");
            return;
        }
        var quartosDisponiveis=hotel.listarQuartosDisponiveis();
        if (quartosDisponiveis.isEmpty()) {
            System.out.println("Nenhum quarto disponível.");
            return;
        }
        for (Quarto quarto : quartosDisponiveis) {
            System.out.println("===== Quarto =====");
            System.out.println("Número: " + quarto.getNumero());
            System.out.println("Tipo: " + quarto.getTipo());
            System.out.println("Preço: " + quarto.getPreco());
            System.out.println("==================");
        }
    }

    public void fazerReserva(
        String nomeHotel, 
        String numeroQuarto, 
        String emailCliente,
        Date dataInicio,
        Date dataFim
    ){
        var hotel=administrador.procuraPeloNomeDoHotel(nomeHotel);
        if (hotel == null) {
            System.out.println("Hotel não encontrado.");
            return;
        }
        var quarto=hotel.procurarQuarto(numeroQuarto);
        if (quarto == null) {
            System.out.println("Quarto não encontrado.");
            return;
        }
        if (!quarto.getEstaDisponivel()){
            System.out.println("Quarto não disponível.");
            return;
        }
        var cliente=administrador.procurarCliente(emailCliente);
        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }
        if (dataFim.before(dataInicio)) {
            System.out.println("Data de fim deve ser posterior a data de início.");
            return;
        }
        cliente.fazerReserva(quarto, emailCliente, nomeHotel);
        System.out.println("Reserva realizada com sucesso.");
    }

    public void cancelarReserva(String reservaId){
        var reserva=administrador.procurarReserva(reservaId);
        if (reserva == null) {
            System.out.println("Reserva não encontrada.");
            return;
        }
        if (reserva.getCancelada()) {
            System.out.println("Reserva já cancelada.");
            return;
        }
        reserva.cancelarReserva();
    }

    public void confirmarReserva(String reservaId){
        var reserva=administrador.procurarReserva(reservaId);
        if (reserva == null) {
            System.out.println("Reserva não encontrada.");
            return;
        }
        if (!reserva.getCancelada()) {
            System.out.println("Reserva já confirmada.");
            return;
        }
        reserva.confirmarReserva();
    }

    public void listarReservasCliente(String emailCliente) {
        var cliente=administrador.procurarCliente(emailCliente);
        if (cliente==null){
            System.out.println("Cliente não encontrado.");
            return;
        }
        var reservas=cliente.getReservas();
        if (reservas.isEmpty()) {
            System.out.println("Nenhuma reserva encontrada.");
            return;
        }
        for (Reserva reserva : reservas) {
            System.out.println("===== Reserva =====");
            System.out.println("ID: " + reserva.getId());
            System.out.println("Data de Início: " + reserva.getDataInicio());
            System.out.println("Data de Fim: " + reserva.getDataFim());
            System.out.println("Quarto: " + reserva.getQuarto().getNumero());
            System.out.println("==================");
        }
    }
}