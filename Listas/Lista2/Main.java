
import Ex1.Produto;
import Ex2.Carro;
import Ex3.ContaBancaria;
import Ex4.Funcionario;
import Ex5.Aluno;
import Ex6.Biblioteca;
import Ex6.Livro;
import Ex7.Pedido;
import Ex8.Menu;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Lista 2");
        System.out.println("##Exercício 1: Criando uma Classe `Produto` com Getters e Setters##");
        Produto p1 = new Produto();
        p1.setNome("Produto 1");
        p1.setPreco(10.0);
        p1.setPreco(-999.0);
        p1.setEstoque(-50);
        p1.setEstoque(10);
        System.out.println("Produto 1:");
        System.out.println("Nome: "+p1.getNome());
        System.out.println("Preço: "+p1.getPreco());
        System.out.println("Estoque: "+p1.getEstoque());
        System.out.println("#######################################");

        System.out.println("##### Exercício 2: Classe `Carro` com Modificadores de Acesso##");
        Carro c1 = new Carro();
        c1.marca="Honda";
        //c1.modelo="Civic"; protected
        c1.setAno(1850);
        c1.setAno(2020);
        c1.setModelo("Civic");
        System.out.println("Carro 1:");
        System.out.println("Marca: "+c1.marca);
        System.out.println("Modelo: "+c1.getModelo());
        System.out.println("Ano: "+c1.getAno());
        System.out.println("#######################################");

        System.out.println("##Exercício 3: Abstração e Encapsulamento com uma Classe##");
        ContaBancaria cb1 = new Ex3.ContaBancaria("João");
        cb1.depositar(100.0);
        cb1.sacar(50.0);
        cb1.sacar(110.0);
        System.out.println("Conta Bancária 1:");
        System.out.println("Titular: "+cb1.getTitular());
        System.out.println("Saldo: "+cb1.consultarSaldo());
        System.out.println("#######################################");

        System.out.println("##Exercício 4: Implementando uma Classe `Funcionario`##");
        Funcionario f1 = new Funcionario("João", 2000.0);
        f1.setSalario(999.0);
        f1.setSalario(2001.0);
        f1.exibirInformacoes();
        
        System.out.println("##Exercício 5: Modificadores de Acesso em uma Classe `Aluno`##");
        Aluno a1 = new Aluno("João","2020000001");
        a1.setNotaFinal(11.0);
        a1.setNotaFinal(-1.0);
        a1.setNotaFinal(9.5);
        //a1.matricula="2020000002"; protected acessivel só no mesmo pacote(Ex5)
        //a1.notaFinal=0.0; private
        a1.exibirDados();
        System.out.println("#######################################");
        System.out.println("##Exercício 6: Classe `Biblioteca` com Listas de Objetos##");
        Biblioteca b1 = new Biblioteca();
        Livro l1 = new Livro("O Senhor dos Anéis","J. R. R. Tolkien");
        Livro l2 = new Livro("Harry Potter","J. K. Rowling");
        Livro l3 = new Livro("O Hobbit","J. R. R. Tolkien");
        Livro l4 = new Livro("Hunter x Hunter","Yoshihiro Togashi");
        b1.AdicionarLivro(l1);
        b1.AdicionarLivro(l2);
        b1.AdicionarLivro(l3);
        b1.AdicionarLivro(l4);
        b1.EmprestarLivro("O Senhor dos Anéis");
        b1.EmprestarLivro("O Senhor dos Anéis");
        b1.EmprestarLivro("Harry Potter");
        b1.ListarLivros();
        b1.DevolverLivro("O Senhor dos Anéis");
        System.out.println("#######################################");

        System.out.println("##Exercício 7: Getters e Setters com Validação na Classe `Pedido`##");
        Pedido p2 = new Pedido();
        p2.setNumeroPedido("2020000001");
        p2.setQuantidade(10);
        p2.setValorUnitario(10.0);
        System.out.println("Pedido 1:");
        System.out.println("Número do Pedido: "+p2.getNumeroPedido());
        System.out.println("Quantidade: "+p2.getQuantidade());
        System.out.println("Valor Unitário: "+p2.getValorUnitario());
        System.out.println("Valor Total: "+p2.getValorTotal());
        System.out.println("#######################################");

        System.out.println("##Exercício 8: Criando um Sistema de Funcionários##");
        Scanner s=new Scanner(System.in);
        Menu m=new Menu();
        var loop=true;
        while(loop){

            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("Menu:");
            System.out.println("1- Adicionar Funcionário");
            System.out.println("2- Aumentar Salário");
            System.out.println("3- Transferir Funcionário");
            System.out.println("4- Listar Funcionários");
            int opcao=s.nextInt();
            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o nome do funcionário:");
                    String nome=s.next();
                    System.out.println("Digite o departamento do funcionário:");
                    String departamento=s.next();
                    System.out.println("Digite o salário do funcionário:");
                    double salario=s.nextDouble();
                    m.adicionarFuncionario(nome, departamento, salario);
                }
                case 2 -> {
                    System.out.println("Digite o nome do funcionário:");
                    String nome = s.next();
                    System.out.println("Digite o percentual de aumento:");
                    double percentual=s.nextDouble();
                    m.aumentarSalario(nome, percentual);
                }
                case 3 -> {
                    System.out.println("Digite o nome do funcionário:");
                    String nome = s.next();
                    System.out.println("Digite o novo departamento:");
                    String departamento = s.next();
                    m.transferir(nome, departamento);
                }
                case 4 -> {
                    m.listarFuncionarios();
                    Thread.sleep(2000);
                }
                default -> {
                    System.out.println("Saindo...");
                    loop=false;
                }
            }
            
        };
        System.out.println("#######################################");

    }
}