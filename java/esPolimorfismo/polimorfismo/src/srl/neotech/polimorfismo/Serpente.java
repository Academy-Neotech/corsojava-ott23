package srl.neotech.polimorfismo;

public class Serpente {

    private int lunghezza;

    public void mangia() {
       System.out.println("Un leona sbrana");
    }


    public void dorme() {
        System.out.println("Un Leone Russa");
    }


    public void siMuove() {
      System.out.println("Un Leone Corre");
    }



    @Override
    public String toString() {
        return "Serpente [lunghezza=" + lunghezza + "]";
    }
   
    

}
