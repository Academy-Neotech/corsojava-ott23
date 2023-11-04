public class App {
    
    public static void main(String[] args) throws Exception {
        
    Palazzo unPalazzoAlCentro=new Palazzo();
    
    Animale fuffy=new Animale();
 
    fuffy.colore="rosso";
    fuffy.nome="fuffy";
    fuffy.razza="gatto";
    fuffy.eta=4;
    fuffy.dorme();
    System.out.println(fuffy.leggiPadrone());    //l'esecuzione avviene dal metodo interno a quello piu esterno

    //bobby è un oggetto di tipo Animale
    //bobby è una variabile di tipo puntatore che punta a una area di meoria di tipo Animale
    Animale bobby=new Animale();
    bobby.nome="bobby";
    bobby.razza="cane";
    bobby.colore="nero";
    bobby.eta=9;
    bobby.mangia();

    Animale dolly=new Animale();
    dolly.eta=34;
    dolly.colore="Viola";


    System.out.println(bobby);
    System.out.println(fuffy);
    System.out.println(dolly);

    Animale teo=new Animale();
    teo.nome="teo";
    bobby.dorme();

     System.out.println(bobby);
     System.out.println(fuffy);
     System.out.println(dolly);
     System.err.println(teo);

    
     Cuccia cuccia=new Cuccia();
     cuccia.toString();













    //// CLASSI INIZIANO CON LETTERA MAIUSCOLA E POI MINUSCOLO
    //Animale

    //OGGETTI INIZIANO CON LETTERA MINUSCOLA E SEGONO LA REGOLA CAMELCASE
    //ilCaneDelVicino

    Animale ilCaneDelVicino=new Animale();
    ilCaneDelVicino.colore="Blu";


    Animale animale=new Animale();
    animale.eta=34;







    }
    

}
