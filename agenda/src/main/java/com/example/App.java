package com.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Agenda agend = new Agenda();
        Scanner scan = new Scanner(System.in);
        int menu = 0;

        while(menu != 5){

            System.out.println("##### Menu Agenda #####");
            System.out.println("Escolha uma das opções:");
            System.out.println("1 - Cadastre um novo Contato");
            System.out.println("2 - Faça a edição de um Contato");
            System.out.println("3 - Remova um Contato");
            System.out.println("4 - Liste todos os Contatos");
            System.out.println("5 - Sair da Agenda");

            menu = scan.nextInt();

            switch (menu) {
                case 1:
                System.out.println("Cadastro de Contato");
                System.out.println("Digite o nome do Contato");
                String nome = scan.next();
                System.out.println("Digite o sexo do Contato");
                String sexo = scan.next();
                System.out.println("Digite o telefone do Contato");
                String telefone = scan.next();
                System.out.println("Digite o email do Contato");
                String email = scan.next();

                Contato cont = new Contato(nome, sexo, telefone, email);

                agend.adiconarContato(cont);

                break;
                case 2:
                System.out.println("Editar um Contato");
                System.out.println("Digite o nome do Contato a ser Editado");
                String nomeE = scan.next(); 

                System.out.println("Digite o nome do Contato");
                String nomeEditar = scan.next();
                System.out.println("Digite o sexo do Contato");
                String sexoEditar = scan.next();
                System.out.println("Digite o telefone do Contato");
                String telefoneEditar = scan.next();
                System.out.println("Digite o email do Contato");
                String emailEditar = scan.next();

                Contato contEditar = new Contato(nomeEditar, sexoEditar, telefoneEditar, emailEditar);

                agend.editarContato(nomeE, contEditar);

                
                break;
                case 3:
                System.out.println("Remova um Contato");
                System.out.println("Digite o nome do Contato");
                String nomeR = scan.next();
                agend.removerContato(nomeR);
                    
                break;
                case 4:
                    System.out.println(agend.listarContato());
                break;
                case 5:
                System.out.println("Sair do Sistema");
                break;
                default:
                System.out.println("Opção Inválida");

                    break;
            }

        }
    }
}
