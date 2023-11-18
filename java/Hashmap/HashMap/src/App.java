import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

import srl.neotech.hashmap.Provincia;

public class App {
    public static void main(String[] args) throws Exception {

        Map<Integer, Provincia> provincie=new TreeMap<Integer, Provincia>();
        
        Provincia roma=new Provincia();
        roma.setNome("Roma");
        roma.setNumeroUniversita(5);
        roma.setPopolazione(3000000);
        provincie.put(200, roma);

        Double c=23.333333d;
        double roundOff = Math.round(c * 10.0) / 10.0;
        System.out.println(roundOff);
        

        Provincia milano=new Provincia();
        milano.setNome("Milano");
        milano.setNumeroUniversita(12);
        milano.setPopolazione(3000000);
        provincie.put(100, milano);


        Provincia torino=new Provincia();
        torino.setNome("Milano");
        torino.setNumeroUniversita(12);
        torino.setPopolazione(3000000);
        provincie.put(30, torino);


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
    
    }
}
