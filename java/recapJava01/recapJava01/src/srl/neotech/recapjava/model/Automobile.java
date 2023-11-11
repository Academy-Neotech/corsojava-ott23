package srl.neotech.recapjava.model;

public class Automobile extends MezzodiTrasporto implements Astronave,MezzoNavale{

    public void cammina(){
        cilindrata=8000;
        System.out.println("Una macchina cammina con cilindrata:"+cilindrata);
        
    }

    @Override
    public void siMuove(){
        System.out.println("Una automobile si muove");
    }

    @Override
    public void spara() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'spara'");
    }

    @Override
    public void viaggia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'viaggia'");
    }

    @Override
    public void immersione() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'immersione'");
    }
    
}
