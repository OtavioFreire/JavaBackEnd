package aula9;

public class Aula9 {

    public static void main(String[] args) {
        
        Pessoa[] p  = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa(" Pedro", 22, "M");
        p[1] = new Pessoa(" Maria",25, "F");
        p[2] = new Aluno("Jao",15,"F",1515,"Java");
        l[0] = new Livro(" A Prendendo JAVA", "Jose da Silva",300, p[0]);
        l[1] = new Livro(" POO para iniciantes", "Pedro Paulo",500, p[1]);
        l[2] = new Livro(" Java Avançado", "Maria Candido", 800, p[0]);
        
        System.out.println(l[0].detalhes());
    }
    
}
