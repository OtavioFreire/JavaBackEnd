package aula9;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totpaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totpaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totpaginas = totpaginas;
        this.leitor = leitor;
    }

    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + 
                ",\n autor=" + autor + ",\n totpaginas=" 
                + totpaginas + ",\n pagAtual=" + pagAtual 
                + ",\n aberto=" + aberto + ",\n leitor= " + this.leitor.getNome()
                + ",\n sexo= " + this.leitor.getSexo() +
                ",\n Idade= " + this.leitor.getIdade() +'}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotpaginas() {
        return totpaginas;
    }

    public void setTotpaginas(int totpaginas) {
        this.totpaginas = totpaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        if(this.getAberto() == false){
            this.setAberto(true);
        }else{System.out.println("O livro ja esta aberto!");}
        
    }

    @Override
    public void fechar() {
        if(this.getAberto()){
            this.setAberto(false);
        }else{System.out.println("O livro ja esta fechado!");}
    }

    @Override
    public void folhear(int p) {
        if(p> this.totpaginas){
            System.out.println("Erro o livro so tem " + this.getTotpaginas());
        }else{this.setPagAtual(p);}
    }

    @Override
    public void avancarPag() {
        if(this.getAberto()){
            this.setPagAtual(this.getPagAtual() + 1);
        }else{
            System.out.println("Abra o livro primeiro!");
        }
    }

    @Override
    public void voltarPag() {
        if(this.getAberto()){
            if(this.pagAtual >=1){
                this.setPagAtual(this.getPagAtual() - 1);
            }else{
                System.out.println("Voce ja esta na primeira pagina do livro!");
            }
        }else{
            System.out.println("Abra o livro primeiro");
        }
    }
    
    
}
