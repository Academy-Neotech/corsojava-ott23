package srl.neotech.fantasy;

public class Ruolo {


    private Double Stamina;
    private Double forzaAttacco;
    private Double forzaDifesa;

    public Double getStamina() {
        return Stamina;
    }

    public void setStamina(Double stamina) {
        Stamina = stamina;
    }

    public Double getForzaAttacco() {
        return forzaAttacco;
    }

    public void setForzaAttacco(Double forzaAttacco) {
        this.forzaAttacco = forzaAttacco;
    }

    public Double getForzaDifesa() {
        return forzaDifesa;
    }

    public void setForzaDifesa(Double forzaDifesa) {
        this.forzaDifesa = forzaDifesa;
    }

    public void attacca(Ruolo nemico){

    }

    protected void difendi(Double attacco){

    }
    
}
