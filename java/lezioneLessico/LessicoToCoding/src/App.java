import srl.neotech.lessico.Automobile;
import srl.neotech.lessico.Motore;
import srl.neotech.lessico.Propulsione;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        //Negli oggetti annidati deve essere fatta la new prima di poterli usare;
        Automobile autoDiMax=new Automobile();
        autoDiMax.motoreB=new Motore();    //creo un oggetto Motore e lo assegno a motoreB
        autoDiMax.motoreB.seriale="asfasfasf";

        autoDiMax.motoreB.propulsione=new Propulsione();  //creo un oggetto Propulsione e lo assegno alla propulsione del motoreB
        autoDiMax.motoreB.propulsione.carburante="elettrico";
        autoDiMax.motoreB.propulsione.quantoInquina=0;

        autoDiMax.motoreA=new Motore();
        autoDiMax.motoreA.kmPercorsi=0;

    }
}
