package aula10;

public class Aula10{

    public static void main(String[] args) {
        Aluno[] a = new Aluno[5];
        
        a[0] = new Aluno("Claudio", 32,"M",1515,"Informatica");
        a[0].pagarMensalidade();
        
        Bolsista[] b = new Bolsista[5];
        
        b[0]= new Bolsista("JOAO",15,"M",1236,"Informatica",15);
        b[0].pagarMensalidade();
        
    }
    
}
