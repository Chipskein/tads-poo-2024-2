import Ex1.ContaBancaria;
import Ex2.Biblioteca;
import Ex2.Livro;
import Ex3.Escola;
import Ex3.Professor;
import Ex4.Casa;
public class Main{
    public static void main(String[] args){
        System.out.println("Lista 3");
        System.out.println("##Exercício 1: Implementar Coesão e Encapsulamento##");
        ContaBancaria conta = new ContaBancaria("1234-5");
        conta.depositar(100);
        conta.sacar(50);
        conta.mostrarSaldo();
        System.out.println("#######################################");

        System.out.println("##Exercício 2: Criar um Exemplo de Associação##");
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("Livro 1", "Autor 1");
        Livro livro2 = new Livro("Livro 2", "Autor 2");
        livro1.setDisponivel(false);
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.mostrarLivros();
        System.out.println("#######################################");

        System.out.println("##Exercício 3: Exemplo de Agregação##");
        Escola escola = new Escola("Escola 1", "Rua linha 1");
        Escola escola2 = new Escola("Escola 2", "Rua linha 2");
        Professor p = new Professor("Professor 1", "1234", "Matemática");
        Professor p1 = new Professor("Professor 2", "12414", "Matemática");
        Professor p2 = new Professor("Professor 3", "1234", "Matemática");
        Professor p3 = new Professor("Professor 4", "1224", "Matemática");
        escola.addProfessor(p);
        escola.addProfessor(p1);
        escola.addProfessor(p2);
        escola2.addProfessor(p2);
        escola2.addProfessor(p3);
        escola.mostrarProfessores();
        escola2.mostrarProfessores();

        System.out.println("#######################################");

        System.out.println("##Exercício 4: Exemplo de Composição##");
        Casa casa = new Casa("Rua linha 1", new String[]{"Sala", "Cozinha", "Quarto"});
        System.out.println(casa.getComodos());
        System.out.println("#######################################");

    }
}