public class Animale {

    //Attributi propritetà a livello di classe
//  modificatore  vidibilità
    public String razza;
    public String nome;
    public int eta;
    public String colore;

    private String padrone;


    //Verbi Metodi Comportamenti behaviours....
    public void mangia(){
        System.out.println(nome+" sta mangiando");
        aggiungiEta();
    }

    private void aggiungiEta(){
        eta=eta+10;
    }


    public int leggiEta(){
        return eta;
    }

    public String leggiPadrone(){
        padrone="Giuseppe";
         return "il padrone è:"+padrone;
    }

    public void dorme(){
    padrone="Max";
    System.out.println("il:"+razza+" di:"+padrone+" "+nome+" sta dormendo");
    }


    @Override
    public String toString() {
        return "Animale [razza=" + razza + ", nome=" + nome + ", eta=" + eta + ", colore=" + colore + ", padrone="
                + padrone + "]";
    }


    
}
