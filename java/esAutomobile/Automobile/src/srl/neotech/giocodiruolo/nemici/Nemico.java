package srl.neotech.giocodiruolo.nemici;
public class Nemico {
    
    //incapsumlaento 
    private String name;
    private int forza;
    private String classe;
    private int numeroOcchi;


    private int contatore; 
    
    

    public int getNumeroOcchi() {
        return numeroOcchi;
    }

    public void setNumeroOcchi(int numeroOcchi) {
        this.numeroOcchi = numeroOcchi;
    }

    //Getter
    public String getName() {
        return name;
    }

    //Setter
    public void setName(String param) {
        this.name = param;
    }



    public int getForza() {
        return forza;
    }


    public void setForza(int forza) {
        this.forza = forza;
    }



    public String getClasse() {
        return classe;
    }


    public void setClasse(String classe) {
        this.classe = classe;
    }


    public void dorme(){

    }

}
