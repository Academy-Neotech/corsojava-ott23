import srl.neotech.giocodiruolo.nemici.Goblin;
import srl.neotech.giocodiruolo.nemici.Nemico;
import srl.neotech.giocodiruolo.nemici.Orco;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

       Nemico n=new Nemico();
       Orco o=new Orco();
       Goblin g=new Goblin(); 
  
       n.setForza(23);
       n.setName("GoblinRosso");
       System.out.println(n.getForza());

       o.setForza(34);
       o.setName("OrcoVerde");
       o.setColore("Verde");
       o.dorme();
       
       g.setNumeroBraccia(21);



    }
}
