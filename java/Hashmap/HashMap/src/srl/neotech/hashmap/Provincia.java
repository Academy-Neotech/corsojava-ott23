package srl.neotech.hashmap;

public class Provincia {

    private String nome;
    private Integer popolazione;
    private Integer numeroUniversita;

    
    public Integer getPopolazione() {
        return popolazione;
    }
    public void setPopolazione(Integer popolazione) {
        this.popolazione = popolazione;
    }
    public Integer getNumeroUniversita() {
        return numeroUniversita;
    }
    public void setNumeroUniversita(Integer numeroUniversita) {
        this.numeroUniversita = numeroUniversita;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Provincia [nome=" + nome + ", popolazione=" + popolazione + ", numeroUniversita=" + numeroUniversita
                + "]";
    }

    
    
}
