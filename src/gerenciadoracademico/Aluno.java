package gerenciadoracademico;

import java.util.Scanner;

public class Aluno extends Pessoa {

    private double nota;
    private String opcao; 
    
    Scanner lerDado = new Scanner (System.in);
    Scanner escolha = new Scanner (System.in);
    String [] vetorAlunos = new String [30];
    
    public double getNota() {
        return nota;
    }

    public void setNota(double parametroNota) {
        this.nota = parametroNota;
    }
    
    public void inserir ( ){
        for (int i=0; i<vetorAlunos.length; i++){
            System.out.println("\nInserir aluno? - SIM / NAO");
            System.out.print("Opção: ");
            opcao = escolha.nextLine();
            if(opcao.equals("S") || opcao.equals("s") || opcao.equals("sim") || opcao.equals("SIM")){
                System.out.println("Aluno "+(i+1)+":");
                vetorAlunos[i] = lerDado.next();
            }else if(opcao.equals("N") || opcao.equals("n") || opcao.equals("nao") || opcao.equals("NAO")){
                break;
            }
        }
    }
        
    public void pesquisar (String parametroPesquisaAluno){
        String pesquisa= parametroPesquisaAluno;
        boolean verificador = false;
            for(int i = 0; i < vetorAlunos.length; i++){
                if(pesquisa.equals(vetorAlunos[i])) {
                    System.out.println("Aluno encontrado!");
                    System.out.println((i+1)+"° Aluno: "+vetorAlunos[i]);
                    verificador = true;
                    break;
                }             
            }
            if (verificador == false){
                System.out.println("Não encontrado!");
            }
    }
    
    public void  excluir( String parametroExcluir ){
         String excluirAluno= parametroExcluir;
            for(int i = 0; i < vetorAlunos.length; i++){
                if(excluirAluno.equals(vetorAlunos[i])) {
                    vetorAlunos[i]=null;
                    System.out.print("Aluno excluido!");
                    break;
                }             
            }
    }
    
    public void mostrarAlunos (){
        System.out.println("Lista de alunos do sistema");
        for(int i = 0; i < vetorAlunos.length; i++){
            System.out.println((i+1)+"° Aluno: "+vetorAlunos[i]);
        }             
    }
}
