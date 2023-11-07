package srl.neotech.alberi;

public class AlberoDaFrutta extends Albero{
    

    private String meseDiMaturazione;


    public String getMeseDiMaturazione() {

        return "il mese è:"+meseDiMaturazione;
    }

    public void setMeseDiMaturazione(String meseDiMaturazione) throws Exception {
       if(meseDiMaturazione.equals("Gennaio")) throw new Exception("Errore: il mese non può essere in inverno");
       
        this.meseDiMaturazione = meseDiMaturazione;
    }

    @Override
    public String toString() {
        return "AlberoDaFrutta [meseDiMaturazione=" + meseDiMaturazione + "]";
    }

    


}
