public class App {
    public static void main(String[] args) throws Exception {
            try {
                String d="ciao";
                int a=5;
                int b=0;
                Motore f=null;
                int c;
                f.setCilindrata(5000);
                c = a/b;
            } catch (Exception e) {
                System.out.println("sono andato in errore");
                e.printStackTrace();
            }
        
        System.out.println("HO TERMINATO IL PROGRAMMA IN MODO CORRETTO");
    }


}
