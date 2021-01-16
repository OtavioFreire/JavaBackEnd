package aula9;

public class Professor extends Pessoa{
    
    private String especialidade;
    private float Salario;
    
    public Professor(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }
    
    public void receberAum(){
    
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }
    
    
}
