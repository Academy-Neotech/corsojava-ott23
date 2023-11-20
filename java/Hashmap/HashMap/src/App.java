import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeMap;

import srl.neotech.hashmap.Provincia;

public class App {
    static int a=5;

    public static void main(String[] args) throws Exception {
        int m=7;
        System.out.println(2* ++m);
        System.out.println(a);
        int c=24;
        int r=67;
        Provincia bergamo=new Provincia();   
        List<Provincia> provincieLombardia=new ArrayList<>();
        provincieLombardia.add(bergamo);//0
        
        Provincia bologna=new Provincia();
        List<Provincia> provincieERomagna=new ArrayList<>();
        provincieERomagna.add(bologna);

        Provincia torino=new Provincia();
        List<Provincia> provinciePiemonte=new ArrayList<>();
        provinciePiemonte.add(torino);


        List<Provincia> provincieItaliane=new ArrayList<>();
        provincieItaliane.addAll(provincieLombardia);
        provincieItaliane.addAll(provincieERomagna);
        provincieItaliane.addAll(provinciePiemonte);

        Provincia roma=new Provincia();
        provincieItaliane.set(1, roma);
        
        System.out.println(provincieItaliane.size());

        Random rand=new Random();

        System.out.println(rand.nextInt(100));
        System.out.println(rand.nextInt(40));

        int min=50;
        int max=100;
        System.out.println("random:"+(rand.nextInt(max-min+1)+min));



        bergamo.setNome(("Bergamo"));
        bergamo.setNumeroUniversita(3);
        System.out.println(bergamo.getNome());

        Map<Integer, Provincia> provincie=new TreeMap<Integer, Provincia>();
        


        double roundOff = Math.round(c * 10.0) / 10.0;
        System.out.println(roundOff);
        

        Provincia milano=new Provincia();
        milano.setNome("Milano");
        milano.setNumeroUniversita(12);
        milano.setPopolazione(3000000);
        provincie.put(100, milano);



        Provincia genova=new Provincia();
        genova.setNome("Milano");
        genova.setNumeroUniversita(12);
        genova.setPopolazione(3000000);
        provincie.put(120, genova);
        
        for(Integer chiave:provincie.keySet()){
           System.out.println("chiave:"+chiave+" oggetto:"+provincie.get(chiave));
        }


        String stringa="lunedi;martedi;mercoledì;giovedì;100;sabato;domenica;lunedì;martedì;mercoledì;giovedì;venerdì;sabato;domenica;lunedì;martedì;mercoledì;giovedì";
        String dati[]=stringa.split(";");
        System.out.println(dati[2]);
        System.err.println(dati[8]);

        StringTokenizer st=new StringTokenizer(stringa, ";");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }


        Map<String, Provincia> mappaProvincie=new TreeMap<>();
        mappaProvincie.put("MI", milano);
        mappaProvincie.put("RM", roma);
        mappaProvincie.put("BG", bergamo);
        mappaProvincie.put("BO", bologna);
        mappaProvincie.remove("NA");
        mappaProvincie.get("MI").setPopolazione(400);
        System.out.println(mappaProvincie.get("RM").getNumeroUniversita());

        mappaProvincie.size();
        mappaProvincie.containsKey("TO");

                      //: contenuto in
        for(String chiave:mappaProvincie.keySet()){
            mappaProvincie.get(chiave).setNumeroUniversita(34);
            System.out.println("CHIVE CHE GIRA:"+chiave+" OGGETTO:"+mappaProvincie.get(chiave));
        }



    
}


}
