package srl.neotech.recapjava.model;

public class Albero {
    

    private Integer lunghezza;
    private Integer eta;
    private Integer larghezza;


    public Integer getEta() {
        return this.eta;
    }


    public void setEta(Integer eta) {
        this.eta = eta;
    }


    public Integer getLarghezza() {
        return this.larghezza;
    }


    public void setLarghezza(Integer larghezza) {
        this.larghezza = larghezza;  
    }


    //firma del metodo
    public String nomeAlbero(Integer numero, String quelloCheVoglio){
       if(!(numero<10)) return "Ulivo";
       else if (numero<50) return "Pino";
           else return "Abete";
    }


    public Integer numeroFoglie(){
        return 6450;
    }


    public Integer getLunghezza() {
        return lunghezza;
    }


    public void setLunghezza(Integer lunghezza) {
        this.lunghezza = lunghezza;
    }
   


    
}
