package srl.neotech.polimorfismo;

public class Leone implements Animale,Mammifero{


    @Override  //Sovrascrittura
    public void mangia() {
       System.out.println("Un leona sbrana");
    }


    @Override
    public void dorme() {
        System.out.println("Un Leone Russa");
    }


    @Override
    public void siMuove() {
      System.out.println("Un Leone Corre");
    }


    @Override
    public String toString() {
        return "Leone";
    }


    @Override
    public void allatta() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'allatta'");
    }



    
}
