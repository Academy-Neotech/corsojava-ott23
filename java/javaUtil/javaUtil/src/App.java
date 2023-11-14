import java.util.Random;

import srl.neotech.util.Astronave;
import srl.neotech.util.Enterprise;
import srl.neotech.util.MilleniumFalcon;
import srl.neotech.util.Nostromo;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        Random r=new Random();
        //0, 1000 range
        System.out.println(r.nextInt(10));

        //r.nextInt(max - min + 1) + min
        int tipoAstronave=r.nextInt(3-1 +1) + 1;
        

        System.out.println(tipoAstronave);
        Astronave x=null;
        if(tipoAstronave==1) x=new Nostromo();
        else if(tipoAstronave==2) x=new Enterprise();
        else x=new MilleniumFalcon();

         x.spara();
        

    }
}
