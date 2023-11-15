import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import srl.neotech.scopevariabili.Insetto;

public class App {
     static int a=5;
     static int b=7;

    public static void main(String[] args) throws Exception {
        
        Insetto ape=new Insetto();
        ape.setNumeroZampe(4);
        ape.setVola(true);

        Insetto mosca=new Insetto();
        mosca.setNumeroZampe(4);
        mosca.setVola(true);


        Insetto arrayDiInsetti[]= new Insetto[3];
        arrayDiInsetti[0]=ape;
        arrayDiInsetti[1]=mosca;
        arrayDiInsetti[2]=mosca;

        Random rand=new Random();
        
        ArrayList<Insetto> listaDinamicaDiInsetti=new ArrayList<>();
        int lunghezzaLista=rand.nextInt(400);

        for (int i=0;i<lunghezzaLista;i++){
            Insetto x=new Insetto();
             x.setNumeroZampe(rand.nextInt(100));
             int vola=rand.nextInt(2-1+1)+1;
             if(vola==1) x.setVola(true);
             else    x.setVola(false);
             listaDinamicaDiInsetti.add(x);
        }

        //  per ogni            contenuto in        
        for(Insetto iesimoInsetto : listaDinamicaDiInsetti) {
            iesimoInsetto.setNumeroZampe(5);
            iesimoInsetto.setVola(false);
        }

           //  per ogni         contenuto in        
        for(Insetto iesimoInsetto : listaDinamicaDiInsetti) {
         System.out.println(iesimoInsetto);
        }

    }

}
