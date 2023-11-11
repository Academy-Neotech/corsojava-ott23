package srl.neotech.recapjava.model;

public class Enterprise implements Astronave{

   

    //Annotations comportamento che decora un metodo o un attributo 
    @Override
    public void spara() {
        // TODO Auto-generated method stub
        System.out.println("L'enterprise spara");
    }


    
    @Override
    public void viaggia() {
        // TODO Auto-generated method stub
        System.err.println("L'enterprise viaggia");
    }


    
}
