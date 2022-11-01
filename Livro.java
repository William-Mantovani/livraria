package livraria_wm;
public class Livro implements Publicacao{ // implementado todo a a calsse interface
          //atributos
          private String titulo;
          private String  autor;
          private int totPaginas;
          private int pagAtual;
          private boolean aberto;
          private Pessoa leitor;
          //classes publicas
          
//          public void detalhes(){?} // no lugar dessa classe, colocarei toString(detalhes), que retornara todos os atributos

          public String detalhes() {
                    System.out.println("#############################################");
                    return "Livro{" + " titulo = " + titulo + "\n, autor = " + autor + "\n, totPaginas = " + totPaginas + "\n, pagAtual = " + pagAtual + 
                            "\n, aberto = " + aberto + "\n, leitor = " + leitor.getNome() + 
                            ", idade = " + leitor.getIdade()+", sexo = " + leitor.getSexo()+ '}';
                    
          }
          
          
          //classes especiais

          public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {//pagAtual e aberto não foram selecionados pq aberto quando for instanciado estara fechado  e pag aberto == 0
                    this.titulo = titulo;
                    this.autor = autor;
                    this.totPaginas = totPaginas;
                    this.pagAtual = 0;
                    this.aberto = false;
                    this.leitor = leitor;
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

          public int getTotPaginas() {
                    return totPaginas;
          }

          public void setTotPaginas(int totPaginas) {
                    this.totPaginas = totPaginas;
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
                    this.aberto = true;
          }

          @Override
          public void fechar() {
                    this.aberto = false;
          }

          @Override
          public void folhear(int pg) { //folher em determinada pagina
                    if(pg > this.totPaginas){
                              this.pagAtual = 0;
                    }else{
                    this.pagAtual = pg;
                    }
                              
                    }

          @Override
          public void avancarPag() {
                   this.pagAtual = this.pagAtual + 10;
          }

          @Override
          public void voltarPag() {
                    this.pagAtual--;
                   
          }
          
          
}
