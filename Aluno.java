package aula9;

public class Aluno extends Pessoa {
   private int matr;
   private String curso;

    public Aluno(String nome,int idade,String sexo,int matr, String curso) {
        super(nome, idade, sexo);
        this.matr = matr;
        this.curso = curso;
    }

   
    
    public void cancelamentoMatr(){
    
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
