package gerenciadoracademico;

import java.util.Scanner;

public class Turma {

    private int numeroTurma;
    private String professorResponsavel;
    private int quantidadeAlunos;
    private int sala;
    private String opcao; 
      
    Scanner lerDado = new Scanner (System.in);
    Scanner escolha = new Scanner (System.in);
    String [] vetorTurmas = new String [10];

    public int getNumeroTurma() {
        return numeroTurma;
    }

    public String getProfessorResponsavel() {
        return professorResponsavel;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public int getSala() {
        return sala;
    }

    public void setNumeroTurma(int parametroNumeroTurma) {
        this.numeroTurma = parametroNumeroTurma;
    }

    public void setProfessorResponsavel(String parametroProfessorResponsavel) {
        this.professorResponsavel = parametroProfessorResponsavel;
    }

    public void setQuantidadeAlunos(int parametroQuantidadeAlunos) {
        this.quantidadeAlunos = parametroQuantidadeAlunos;
    }

    public void setSala(int parametroSala) {
        this.sala = parametroSala;
    }
    
    public void inserir (){
	for (int i=0; i<vetorTurmas.length; i++){
            System.out.println("\nInserir turma? - SIM / NAO");
            System.out.print("Opção: ");
            opcao = escolha.nextLine();
            if(opcao.equals("S") || opcao.equals("s") || opcao.equals("sim") || opcao.equals("SIM")){
                System.out.println("Turma "+(i+1)+":");
                vetorTurmas[i] = lerDado.next();
            }else if(opcao.equals("N") || opcao.equals("n") || opcao.equals("nao") || opcao.equals("NAO")){
                break;
            }
        }
    }
    
    public void pesquisar (String parametroPesquisaTurma){
        String pesquisa= parametroPesquisaTurma;
        boolean verificador = false;
            for(int i = 0; i < vetorTurmas.length; i++){
                if(pesquisa.equals(vetorTurmas[i])) {
                    System.out.println("Turma encontrada!");
                    System.out.println((i+1)+"° Turma: "+vetorTurmas[i]);
                    verificador = true;
                    break;
                }              
            }
            if (verificador == false){
                System.out.println("Não encontrada!");
            }
    }
    
    public void  excluir( String parametroExcluir ){
         String excluirTurma= parametroExcluir;
            for(int i = 0; i < vetorTurmas.length; i++){
                if(excluirTurma.equals(vetorTurmas[i])) {
                    vetorTurmas[i]=null;
                    System.out.print("Turma excluida!");
                    break;
                }             
            }
    }
    
    public void mostrarTurma (){
        System.out.println("Lista de turmas do sistema");
        for(int i = 0; i < vetorTurmas.length; i++){
            System.out.println((i+1)+"° Turma: "+vetorTurmas[i]);
        }             
    }
}
