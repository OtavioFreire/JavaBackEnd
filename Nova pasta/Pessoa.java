package aula10;

public abstract class Pessoa {
    
    //------------------------------ATRIBUTOS----------------------------
    private String nome;
    private int idade;
    private String sexo;
    //------------------------------ATRIBUTOS----------------------------
    
    //-----------------------------CONSTRUTOR---------------------------
    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    //-----------------------------CONSTRUTOR---------------------------
    
    //----------------------------METODOS--------------------------------
    public void fazerAniversario(){
        this.idade++;
    }

    public String dados() {
        return "Dados{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    } 
    //----------------------------METODOS--------------------------------
    
    //-----------------------METODOS ESPECIAIS---------------------------
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    //-----------------------METODOS ESPECIAIS---------------------------
    
}
