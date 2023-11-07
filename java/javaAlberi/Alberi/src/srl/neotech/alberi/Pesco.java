package srl.neotech.alberi;

public class Pesco extends AlberoDaFrutta{

    private boolean pescheGialle;

    public boolean isPescheGialle() {
        return pescheGialle;
    }

    public void setPescheGialle(boolean pescheGialle) {
        this.pescheGialle = pescheGialle;
    }

    @Override
    public String toString() {
        return "PESCO hapeschegialle:"+pescheGialle+" mesedimaturazione:"+getMeseDiMaturazione()+" altezza:"+getAltezza();
    }


    
}
