public class Test implements ITest{


    private String via;


    @Override
    public void scrivi() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'scrivi'");
    }

    @Override
    public void leggi() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'leggi'");
    }

    @Override
    public void mangia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mangia'");
    }

    //tutti i getter tornano il valore
    public String getVia() {
        return via;
    }


    //I setter tornano void !!!!!!
    public void setVia(String via) {
        this.via = via;
    }

    

}
