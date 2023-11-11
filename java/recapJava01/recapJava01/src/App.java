import srl.neotech.recapjava.managers.Test;
import srl.neotech.recapjava.model.Albero;
import srl.neotech.recapjava.model.Astronave;
import srl.neotech.recapjava.model.Automobile;
import srl.neotech.recapjava.model.Enterprise;
import srl.neotech.recapjava.model.Incrociatore;
import srl.neotech.recapjava.model.Nostromo;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Albero a=new Albero();
        a.setEta(40);
        Integer e=a.getEta();
        e=e+1;
                


        a.setLarghezza(10);



        Test t=new Test();

        System.out.println(a.numeroFoglie());
        System.out.println(a.nomeAlbero(t.valoreIntero(),"Ciao"));
 

        Automobile auto=new Automobile();
        auto.siMuove();

        /* 
        Astronave ncc1701=new Enterprise();
        Astronave ncc4567=new Nostromo();
        elaboraAstronave(ncc1701);
        elaboraAstronave(ncc4567);
        */

        Astronave inc=new Incrociatore();
        Astronave ent=new Enterprise();
        
        elaboraAstronave(inc);
        elaboraAstronave(ent);
    }

    private static void elaboraAstronave(Astronave astronave){

        astronave.spara();
        astronave.viaggia();
    }
}
