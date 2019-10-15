
package gerenciadoracademico;

import java.util.Scanner;

public class Disciplina {
    Scanner lerDado = new Scanner (System.in);
    Scanner escolha = new Scanner (System.in);
    String [] vetorDisciplinas = new String [5];
    
    private String opcao; 

    public void inserir (){
	for (int i=0; i<vetorDisciplinas.length; i++){
            System.out.println("\nInserir disciplina? - SIM / NAO");
            System.out.print("Opção: ");
            opcao = escolha.nextLine();
            if(opcao.equals("S") || opcao.equals("s") || opcao.equals("sim") || opcao.equals("SIM")){
                System.out.println("Disciplina "+(i+1)+":");
                vetorDisciplinas[i] = lerDado.next();
            }else if(opcao.equals("N") || opcao.equals("n") || opcao.equals("nao") || opcao.equals("NAO")){
                break;
            }
        }
    }
    
    public void pesquisar (String parametroPesquisaDisciplina){
        String pesquisa= parametroPesquisaDisciplina;
        boolean verificador = false;
            for(int i = 0; i < vetorDisciplinas.length; i++){
                if(pesquisa.equals(vetorDisciplinas[i])) {
                    System.out.println("Disciplina encontrada!");
                    System.out.println((i+1)+"°Disciplina: "+vetorDisciplinas[i]);
                    verificador = true;
                    break;
                }             
            }
            if (verificador == false){
                System.out.println("Não encontrada!");
            }
    }
    
    public void  excluir( String parametroExcluir ){
         String excluirDisciplina= parametroExcluir;
            for(int i = 0; i < vetorDisciplinas.length; i++){
                if(excluirDisciplina.equals(vetorDisciplinas[i])) {
                    vetorDisciplinas[i]=null;
                    System.out.print("Disciplina excluida!");
                    break;
                }             
            }
    }
    
    public void mostrarDisciplinas (){
        System.out.println("Lista de disciplinas do sistema");
        for(int i = 0; i < vetorDisciplinas.length; i++){
            System.out.println((i+1)+"° Disciplina: "+vetorDisciplinas[i]);
        }             
    }    
}
