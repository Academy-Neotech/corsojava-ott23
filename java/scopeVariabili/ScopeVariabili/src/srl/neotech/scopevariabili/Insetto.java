package srl.neotech.scopevariabili;

public class Insetto {
    
 private Integer numeroZampe;
 private Boolean vola;
 
public Integer getNumeroZampe() {
    return numeroZampe;
}
public void setNumeroZampe(Integer numeroZampe) {
    this.numeroZampe = numeroZampe;
}
public Boolean getVola() {
    return vola;
}
public void setVola(Boolean vola) {
    this.vola = vola;
}


@Override
public String toString() {
    return "Insetto [numeroZampe=" + numeroZampe + ", vola=" + vola + "]";
}


    
}
