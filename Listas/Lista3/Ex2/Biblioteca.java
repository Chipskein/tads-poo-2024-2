package Ex2;
import java.util.ArrayList;
import java.util.List;
public class Biblioteca{
    private List<Livro> livros;
    public Biblioteca(){
        this.livros = new ArrayList<>();
    }
    
    public void adicionarLivro(Livro livro){
        for(Livro l : this.livros){
            if(l.getTitulo().equals(livro.getTitulo())){
                throw new IllegalArgumentException("Livro já cadastrado");
            }
        }
        this.livros.add(livro);
    }

    public void mostrarLivros(){
        for(Livro livro : this.livros){
            if (livro.getDisponivel()){
                System.out.println("Título: "+livro.getTitulo());
                System.out.println("Autor: "+livro.getAutor());
                System.out.println();
            }
        }
    }

}