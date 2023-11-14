import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    

    //Array ha lunghezza fissa !!!!!!!!
    ArrayList<Integer> numeriUsciti=new ArrayList<>();


    Random r=new Random();
    int numeroSelezionato=r.nextInt(90);
    while (numeriUsciti.size()<90){
    int cicli=0;    
    while(numeriUsciti.contains(numeroSelezionato)){
        numeroSelezionato=r.nextInt(90);
        cicli++;
    }

    System.out.println("E' uscito il:"+numeroSelezionato+" con cicli effettuati:"+cicli);
    numeriUsciti.add(numeroSelezionato);
  
    }
}
    
}
