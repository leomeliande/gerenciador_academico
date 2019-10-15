package gerenciadoracademico;

import java.util.Scanner;

public class Professor extends Pessoa {
    private String nomeDisciplina;
    private String opcao; 
    
    Scanner lerDado = new Scanner (System.in);
    Scanner escolha = new Scanner (System.in);
    String [] vetorProfessores = new String [10];    
    
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String parametroNomeDisciplina) {
        this.nomeDisciplina = parametroNomeDisciplina;
    }
    
    public void inserir (){
	for (int i=0; i<vetorProfessores.length; i++){
            System.out.println("\nInserir professor? - SIM / NAO");
            System.out.print("Opção: ");
            opcao = escolha.nextLine();
            if(opcao.equals("S") || opcao.equals("s") || opcao.equals("sim") || opcao.equals("SIM")){
                System.out.println("Professor "+(i+1)+":");
                vetorProfessores[i] = lerDado.next();
            }else if(opcao.equals("N") || opcao.equals("n") || opcao.equals("nao") || opcao.equals("NAO")){
                break;
            }
        }
    }
    
    public void pesquisar (String parametroPesquisaProfessor){
    String pesquisa= parametroPesquisaProfessor;
    boolean verificador = false;
        for(int i = 0; i < vetorProfessores.length; i++){
            if(pesquisa.equals(vetorProfessores[i])) {
                System.out.println("Professor encontrado!");
                System.out.println((i+1)+"° Professor: "+vetorProfessores[i]);
                verificador = true;
                break;
            }             
        }
        if (verificador == false){
            System.out.println("Não encontrado!");
        }
    }
    
   public void  excluir( String parametroExcluir ){
         String excluirProfessor= parametroExcluir;
            for(int i = 0; i < vetorProfessores.length; i++){
                if(excluirProfessor.equals(vetorProfessores[i])) {
                    vetorProfessores[i]=null;
                    System.out.print("Professor excluido!");
                    break;
                }             
            }
    }
   
   public void mostrarProfessores (){
       System.out.println("Lista de professores do sistema");
       for(int i = 0; i < vetorProfessores.length; i++){
            System.out.println((i+1)+"° Professor: "+vetorProfessores[i]);
       }             
    }
}
