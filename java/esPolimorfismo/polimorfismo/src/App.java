import srl.neotech.polimorfismo.Animale;
import srl.neotech.polimorfismo.Balena;
import srl.neotech.polimorfismo.Balenottera;
import srl.neotech.polimorfismo.Leone;
import srl.neotech.polimorfismo.Mammifero;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //primitivi  boolean int float double char   STACK
        //String classe    oggetti-->                HEAP
        //i primitivi non sono serializzabili !!!!!!!!!!


       Animale leo=new Leone();
       Animale giuseppina=new Balena();    
       Animale unaBalenottera=new Balenottera();

       Mammifero leo2=new Leone();


       System.out.println(leo);
       System.out.println(giuseppina);

       dorme(leo);
       dorme(giuseppina);
       dorme(unaBalenottera);

       mangia(leo);
       mangia(giuseppina);
       mangia(unaBalenottera);

       siMuove(leo);
       siMuove(giuseppina);
       siMuove(unaBalenottera);

    }

    private static void dorme(Animale unAnimale){
        unAnimale.dorme();
    }

    private static void mangia(Animale unAnimale){
        unAnimale.mangia();
    }

    private static void siMuove(Animale unAnimale){
        unAnimale.siMuove();
    }

}
