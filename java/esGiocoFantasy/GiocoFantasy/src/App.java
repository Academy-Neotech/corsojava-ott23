import srl.neotech.fantasy.Demone;
import srl.neotech.fantasy.Orco;
import srl.neotech.fantasy.Ruolo;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Ruolo g=new Orco();
        g.setForzaAttacco(8d);
        g.setForzaDifesa(3d);
        g.setStamina(100d);


        Ruolo d=new Demone();
        d.setForzaAttacco(32d);
        d.setForzaDifesa(2d);
        d.setStamina(300d);

        //Create le due armate...  1000 elementicon valori casuali

     for(int i=0;i<1000;i++){
        while (armata1.get(i).g.getStamina()>0 && armata2.get(i).getStamina()>0){
            armata1.get(i).attacca(armata2.get(i));
            System.out.println("...");
            armata2.get(i).attacca(armata1.get(i));
            System.out.println("--------------");
        }

    }

        if(g.getStamina()<0){
            System.out.println("Goblin morto");
        }
        else System.out.println("Demone morto");


    }
}
