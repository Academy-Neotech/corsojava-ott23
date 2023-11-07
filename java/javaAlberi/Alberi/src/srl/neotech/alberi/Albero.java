package srl.neotech.alberi;

import java.util.Arrays;

public class Albero {
    
    private int eta;
    private int altezza;

    public final int[] giorni={1,2,3,4,5,6,7};

    
    public int getEta() {
        return eta;
    }
    public void setEta(int eta) {
        this.eta = eta;
    }
    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) throws Exception {
        if(altezza<1 || altezza>99) throw new Exception("l'altezza deve essere maggiore di 0 e minore di 99");
        this.altezza = altezza;
    }
    @Override
    public String toString() {
        return "Albero [eta=" + eta + ", altezza=" + altezza + ", giorni=" + Arrays.toString(giorni) + "]";
    }

    
}
