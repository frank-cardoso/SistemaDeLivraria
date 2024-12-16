# Sistema de Gestão de Biblioteca

Bem-vindo ao projeto de Sistema de Gestão de Biblioteca! Este projeto foi desenvolvido como parte de um desafio da trilha de Java do Ignite. O objetivo é aplicar conceitos fundamentais de Java, implementar boas práticas de programação orientada a objetos e criar um sistema funcional para gerenciamento de uma biblioteca.

## Funcionalidades
- **Gerenciamento de Livros**: Listar todos os livros disponíveis, realizar empréstimo de um livro.
- **Estrutura do Projeto**: O projeto é dividido nas seguintes classes principais:
  - **Livro**: Representa os livros na biblioteca, com atributos como id, titulo, autor, disponivel, dataCadastro e dataAtualizacao.
  - **Autor**: Representa os autores dos livros, com atributos como id, nome, e dataNascimento.
  - **Emprestimo**: Gerencia os empréstimos de livros, com informações sobre o livro emprestado e datas de empréstimo e devolução.
  - **Biblioteca**: Gerencia a coleção de livros, autores e empréstimos.

## Requisitos
- Java Development Kit (JDK) 8 ou superior
- IDE de sua escolha (Eclipse, IntelliJ IDEA, NetBeans, etc.)

## Instalação
1. Clone o repositório para sua máquina local.
   ```sh
   git clone https://github.com/frank-cardoso/SistemaDeLivraria.git

## Uso

    Ao iniciar, a aplicação irá perguntar se você deseja ver os livros disponíveis.
    Após escolher um livro, você pode realizar o empréstimo, que será registrado e o livro marcado como indisponível.

## Contribuindo

Sinta-se à vontade para contribuir com o projeto! Você pode:

    Reportar bugs
    Sugerir novas funcionalidades
    Enviar pull requests com melhorias ou correções

## Licença

Este projeto está licenciado sob a MIT License.

3. Salve o arquivo e faça um commit das mudanças:
   ```sh
   git add README.md
   git commit -m "Add introduction to README.md"
   git push
