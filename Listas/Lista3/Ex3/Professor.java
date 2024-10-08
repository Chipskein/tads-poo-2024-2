package Ex3;
public class Professor{
    private String nome;
    private String matricula;
    private String disciplina;
    public Professor(String nome, String matricula, String disciplina){
        this.nome = nome;
        this.matricula = matricula;
        this.disciplina = disciplina;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getDisciplina(){
        return this.disciplina;
    }
    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Professor{");
        sb.append("nome=").append(nome);
        sb.append(", matricula=").append(matricula);
        sb.append(", disciplina=").append(disciplina);
        sb.append('}');
        return sb.toString();
    }

}
