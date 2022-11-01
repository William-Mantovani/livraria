package livraria_wm;
public class livrariaWM {

          public static void main(String[] args) {
                 Pessoa ps[] = new Pessoa[2];
                 Livro lv[] = new Livro[3];
                 
                 ps[0] = new Pessoa("William Mantovani",25, "Masculino");
                 ps[1] = new Pessoa("Larissa trivelin", 24, "Feminino");
                 
                 lv[0] = new Livro("Jujutsu Kaisen","GEGE AKUTAMI",580, ps[0]);
                 lv[1] = new Livro("The Promised Neverland","YAKUSOKU",600, ps[0]);
                 lv[2] = new Livro("Corte de névoa e fúria","SARAH J MASS", 660, ps[1] );
                 
                 lv[0].abrir();
                 lv[0].folhear(500);
                 System.out.println(lv[0].detalhes());//se chamar so lv[0].detalhes, ele so retornara ok, e pra mostar tem que dar print
                 lv[0].avancarPag();
                 System.out.println(lv[0].detalhes());
                 lv[2].abrir();
                 lv[2].folhear(280);
                 System.out.println(lv[2].detalhes());
                 
          }
          
}
