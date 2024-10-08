package Ex6;
import java.util.List;
import java.util.ArrayList;
public class Biblioteca{
    private List<Livro> livros;
    public Biblioteca(){
        this.livros=new ArrayList<Livro>();
    }
    private int procurarIndexLivro(String titulo){
        for(int i=0;i<livros.size();i++){
            if(livros.get(i).titulo.equals(titulo)){
                return i;
            }
        }
        return -1;
    }
    public void AdicionarLivro(Livro livro){
        var index=this.procurarIndexLivro(livro.titulo);
        if (index==-1){
            this.livros.add(livro);
        } else{
            livros.set(index, livro);
        }
    }

    public void EmprestarLivro(String titulo){
        var index=this.procurarIndexLivro(titulo);
        if (index==-1){
            System.out.println("Livro não encontrado.");
            return;
        }
        if (livros.get(index).disponivel){
            livros.get(index).disponivel=false;
            System.out.println("Livro emprestado com sucesso.");
        } else{
            System.out.println("Livro indisponível.");
        }
    }

    public void DevolverLivro(String titulo){
        var index=this.procurarIndexLivro(titulo);
        if (index==-1){
            System.out.println("Livro não encontrado.");
            return;
        }
        if (!livros.get(index).disponivel){
            livros.get(index).disponivel=true;
            System.out.println("Livro devolvido com sucesso.");
        } else{
            System.out.println("Livro já disponível.");
        }
    }

    public void ListarLivros(){
        for(Livro livro: this.livros){
            System.out.println("Título: "+livro.titulo);
            System.out.println("Autor: "+livro.autor);
            System.out.println("Disponível: "+(livro.disponivel?"Sim":"Não"));
            System.out.println("----------");
        }
    }
}