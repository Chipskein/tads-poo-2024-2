package Ex4;
class Comodo{
    private String nome;
    private Casa casa;
    public Comodo(String nome,Casa casa){
        this.nome = nome;
        this.casa = casa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Comodo{");
        sb.append("nome=").append(nome);
        sb.append(", casa=").append(casa);
        sb.append('}');
        return sb.toString();
    }

}