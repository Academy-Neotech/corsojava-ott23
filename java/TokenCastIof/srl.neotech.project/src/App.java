import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.StringTokenizer;

public class App {
    public static void main(String[] args) throws Exception {
        String str="gen=1;feb=2;mar=3;apr=4";
        StringTokenizer strToken=new StringTokenizer(str, ";");
        while(strToken.hasMoreTokens()){  
            String dato=strToken.nextToken();
            String[] datiInterni=dato.split("=");
            String numeroInStringa=datiInterni[1];;
            Integer numero=Integer.getInteger(numeroInStringa);
            System.out.println(Animale.corri());

        }

        Animale a=new Leone();
        Animale b=new Ippopotamo();
        if(b instanceof Animale) {
        System.out.println("Un ippopotamo è un animale");
        }
        else {
            System.out.println("Un ippopotamo non è un animale");
        }


        if(b instanceof Leone) {
        System.out.println("Un ippopotamo è un leone");
        }
        else {
            System.out.println("Un ippopotamo non è un leone");
        }


        ArrayList<Animale> animali=new ArrayList<>();
        Random r=new Random();
        Animale animale=null;
        for(int i=0;i<1000;i++){
            int tipoAnimale=r.nextInt(2-1+1)+1;
            if(tipoAnimale==1) animale=new Leone();
            if(tipoAnimale==2) animale=new Ippopotamo();
            animali.add(animale);
        }

    
        Integer numeroLeoni=0;
        Integer numeroIppopotami=0;
        for(Animale creatura:animali){
            if(creatura instanceof Leone) numeroLeoni=numeroLeoni+1;
            if(creatura instanceof Ippopotamo) numeroIppopotami=numeroIppopotami+1;
        }
        System.out.println("Ci sono:"+numeroIppopotami+" Ippopotami e:"+numeroLeoni+" leoni");


        Date data=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
        String dataFormattata=sdf.format(data);
        System.out.println(dataFormattata);

        Calendar calendar=new GregorianCalendar();
        calendar.setTime(data);
        System.out.println("ORA:"+calendar.get(Calendar.HOUR));
        System.out.println("GIORNO DELLA SETTIMANA:"+calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("GIORNO DELLANNO:"+calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("GIORNO DEL MESE:"+calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("GIORNO DELLA SETTIMANA NEL MESE:"+calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("SETTIMANA NEL MESE:"+calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("SETTIMANA NELL'ANNO:"+calendar.get(Calendar.WEEK_OF_YEAR));

        calendar.add(Calendar.WEEK_OF_YEAR,12470);
        System.out.println("Con 2 SETTIMANE AGGIUNTE:"+calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("Con 2 SETTIMANE AGGIUNTE:"+calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Anno AGGIUNTo:"+calendar.get(Calendar.YEAR));
        System.out.println("Anno AGGIUNTo:"+calendar.get(Calendar.MONTH));
        System.out.println("Anno AGGIUNTo:"+calendar.get(Calendar.DAY_OF_MONTH));
        
        Date primaData=new Date();
        Thread.sleep(5000);
        Date secondaData=new Date();
        Long differenza=secondaData.getTime()-primaData.getTime();
        System.out.println("la differenza è:"+differenza);
        if(primaData.getTime()<secondaData.getTime()) System.out.println("La prima è minore");
        else System.out.println("La seconda è maggiore");

    }
}
