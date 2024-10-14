public class SistemaReservas{
    private Administrador administrador;
    public SistemaReservas(){
        this.administrador = new Administrador("Administrador");
    }
    
    public void adicionarHotel(String nome, String endereco){
        var hotel=new Hotel(nome, endereco);
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
        var hoteis = administrador.listarHoteis();
        for (Hotel hotel : hoteis) {
            if (hotel.getNome().equals(nomeHotel)) {
                var quarto = new Quarto(numero, tipoQuarto, preco);
                hotel.adicionarQuarto(quarto);
                System.out.println("Quarto adicionado com sucesso.");
                return;
            }
        }
        System.out.println("Hotel não encontrado.");
    }
    
    public void listarQuartosDisponiveis(){
        throw new UnsupportedOperationException("Não implementado");
    }

    public void fazerReserva(){
        throw new UnsupportedOperationException("Não implementado");
    }

    public void cancelarReserva(){
        throw new UnsupportedOperationException("Não implementado");
    }

    public void listarReservasCliente() {
        throw new UnsupportedOperationException("Não implementado");
    }
}