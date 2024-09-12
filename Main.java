import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        Autor autor1 = new Autor(1, "José Saramago", new Date());
        Autor autor2 = new Autor(2, "Clarice Lispector", new Date());

        biblioteca.adicionarAutor(autor1);
        biblioteca.adicionarAutor(autor2);

        Livro livro1 = new Livro(1, "Terra do Pecado", autor1);
        Livro livro2 = new Livro(2, "Perto do coração", autor2);
        Livro livro3 = new Livro(3, "Memorial do convento", autor1);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        while (true) {
            System.out.println("Deseja ver os livros disponiveis? (sim/não)");
            String resposta = scanner.nextLine().toLowerCase();

            if (resposta.equals("sim")) {
                List<Livro> livrosDisponiveis = biblioteca.listarLivrosDisponiveis();

                if (livrosDisponiveis.isEmpty()) {
                    System.out.println("Não há livros disponiveis no momento");
                } else {
                    System.out.println("Livros disponiveis:");
                    for (Livro livro : livrosDisponiveis) {
                        System.out.println(livro.getId() + " " + livro.getTitulo());
                    }

                    System.out.println("Digite o ID do livro que você deseja emprestar: ");
                    int idLivro = scanner.nextInt();
                    scanner.nextLine();

                    Livro livroSelecionado = biblioteca.buscarLivroPorId(idLivro);

                    if (livroSelecionado != null && livroSelecionado.isDisponivel()) {
                        System.out.println("Digite seu nome:");
                        String nomeUsuario = scanner.nextLine();

                        biblioteca.emprestarLivros(livroSelecionado, nomeUsuario);
                        System.out.println("O livro " + livroSelecionado.getTitulo() +"foi emprestado para " + nomeUsuario);
                    } else {
                        System.out.println("Livro não encontrado ou não disponivel");
                    }
                }
            }  else if (resposta.equals("nao")) {
                System.out.println("Obrigado por utilizar o sistema da biblioteca.");
                break;
            } else {
                System.out.println("Resposta inválida. Por favor, responda com 'sim' ou 'nao'.");
            }
        }

        scanner.close();
    }
}
