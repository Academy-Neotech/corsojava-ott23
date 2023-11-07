package srl.neotech.polimorfismo;

public class Balena implements Animale,Mammifero{

    @Override
    public void mangia() {
        System.out.println("Una Balena inghiotte");
    }

    @Override
    public void dorme() {
        System.out.println("Una balena non dorme mai");
    }

    @Override
    public void siMuove() {
        System.out.println("Una Balena nuota");
    }

    @Override
    public void allatta() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'allatta'");
    }
    

}
