package gerenciadoracademico;

import java.util.Scanner;
import java.io.IOException;

public class Controlador {
    
    public static void menu(){
        System.out.println("\n\tSistema de controle acadêmico");
        System.out.println("1. Aluno");
        System.out.println("2. Turma");
        System.out.println("3. Professor");
        System.out.println("4. Disciplina");
        System.out.println("5. Exibir todos os registros");
        System.out.println("6. Sair\n");
        System.out.print("Opcao: ");
    }
    
    public static void limpatela() {     
        System.out.println("\n");  
    }  

    public static void main(String[] args) throws IOException, InterruptedException {
        Aluno novoAluno = new Aluno();
        Professor novoProfessor = new Professor();
        Turma novaTurma = new Turma();
        Disciplina novaDisciplina = new Disciplina();
        String parametroExcluir;
        
        int escolha;
        int opcao1, opcao2, opcao3, opcao4;
        Scanner entrada = new Scanner(System.in);
        
        do{
            menu();
            escolha = entrada.nextInt();
        
            switch(escolha){
                case 1:
                    limpatela();
                    System.out.println("O que deseja fazer?\n");
                    System.out.println("1. Inserir aluno");
                    System.out.println("2. Pesquisar aluno");
                    System.out.println("3. Excluir aluno");
                    
                    System.out.print("Opcao: ");
                    opcao1 = entrada.nextInt();
                    
                    switch(opcao1){
                        case 1:
                            System.out.print("\nInserção de aluno no sistema:\n");
                            novoAluno.inserir();
                            break;
                        case 2:
                            System.out.print("\nPesquisa de um aluno:\n");
                            String parametroPesquisaAluno = novoAluno.lerDado.next();
                            novoAluno.pesquisar(parametroPesquisaAluno);
                            break;
                        case 3:
                            System.out.print("\nExclusão de um aluno:\n");
                            parametroExcluir = novoAluno.lerDado.next();
                            novoAluno.excluir(parametroExcluir);
                            System.out.print("\n");
                            break;
                    }
                    break;
                    
                case 2:
                    limpatela();
                    System.out.println("O que deseja fazer?\n");
                    System.out.println("1. Inserir turma");
                    System.out.println("2. Pesquisar turma");
                    System.out.println("3. Excluir turma");
                    
                    System.out.print("Opcao: ");
                    opcao2 = entrada.nextInt();
                    
                    switch(opcao2){
                        case 1:
                            System.out.print("\nInserção de turma no sistema:\n");
                            novaTurma.inserir();
                            break;
                        case 2:
                            System.out.print("\nPesquisa de uma turma:\n");
                            String parametroPesquisaTurma = novaTurma.lerDado.next();
                            novaTurma.pesquisar(parametroPesquisaTurma);
                            break;
                        case 3:
                            System.out.print("\nExclusão de uma turma:\n");
                            parametroExcluir = novaTurma.lerDado.next();
                            novaTurma.excluir(parametroExcluir);
                            System.out.print("\n");
                            break;
                    }
                    break;
                    
                case 3:
                    limpatela();
                    System.out.println("O que deseja fazer?\n");
                    System.out.println("1. Inserir professor");
                    System.out.println("2. Pesquisar professor");
                    System.out.println("3. Excluir professor");
                    
                    System.out.print("Opcao: ");
                    opcao3 = entrada.nextInt();
                    
                    switch(opcao3){
                        case 1:
                            System.out.print("\nInserção de professor no sistema:\n");
                            novoProfessor.inserir();
                            break;
                        case 2:
                            System.out.print("\nPesquisa de um professor:\n");
                            String parametroPesquisaProfessor = novoProfessor.lerDado.next();
                            novoProfessor.pesquisar(parametroPesquisaProfessor);
                            break;
                        case 3:
                            System.out.print("\nExclusão de um professor:\n");
                            parametroExcluir = novoProfessor.lerDado.next();
                            novoProfessor.excluir(parametroExcluir);
                            System.out.print("\n");
                            break;
                    }
                    break;
                
                case 4:
                    limpatela();
                    System.out.println("O que deseja fazer?\n");
                    System.out.println("1. Inserir disciplina");
                    System.out.println("2. Pesquisar disciplina");
                    System.out.println("3. Excluir disciplina");
                    
                    System.out.print("Opcao: ");
                    opcao4 = entrada.nextInt();
                    
                    switch(opcao4){
                        case 1:
                            System.out.print("\nInserção de disciplina no sistema:\n");
                            novaDisciplina.inserir();
                            break;
                        case 2:
                            System.out.print("\nPesquisar uma Disciplina:\n");
                            String parametroPesquisaDisciplina = novaDisciplina.lerDado.next();
                            novaDisciplina.pesquisar(parametroPesquisaDisciplina);
                            break;
                        case 3:
                            System.out.print("\nExcluir uma disciplina:\n");
                            parametroExcluir = novaDisciplina.lerDado.next();
                            novaDisciplina.excluir(parametroExcluir);
                            System.out.print("/n");
                            break;
                    }
                    break;
                    
                case 5:
                    limpatela();
                    System.out.print("Exibição de todos os registros do sistema\n");
                    novoAluno.mostrarAlunos();
                    System.out.print("\n");
                    novoProfessor.mostrarProfessores();
                    System.out.print("\n");
                    novaTurma.mostrarTurma();
                    System.out.print("\n");
                    novaDisciplina.mostrarDisciplinas();
                    System.out.print("\n");
                    break;
                    
                default:
                    System.out.println("\tObrigado por utilizar o sistema!");
            }
            } while(escolha != 6);
    }
}