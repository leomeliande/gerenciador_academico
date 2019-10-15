package gerenciadoracademico;

public abstract class Pessoa {

    private int matricula;
    private String nome;

    public void SetMatricula(int parametroMatricula) {
		this.matricula = parametroMatricula;
    }

    public int getMatricula() {
		return matricula;
    }

    public void setNome(String parametroNome) {
    this.nome = parametroNome;
    }
	
    public String getNome() {
        return nome;
    }
    
    public void inserir (){
    }
    
    public void excluir (){
    }
}