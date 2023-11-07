import srl.neotech.alberi.Abete;
import srl.neotech.alberi.Albero;
import srl.neotech.alberi.Pesco;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            Albero x=new Albero();

            x.giorni[1]=23;


            Pesco p=new Pesco();
            p.setAltezza(23);
            p.setEta(10);
            p.setMeseDiMaturazione("Maggio");
            p.setPescheGialle(false);
            System.out.println(p);


            
            Abete a=new Abete();
            a.setAltezza(40);
            a.setAltezza(40);
            a.setEta(90);
            a.setHaResina(true);
            a.setProntoPerNatale(true);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}
