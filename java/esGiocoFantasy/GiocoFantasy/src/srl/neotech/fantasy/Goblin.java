package srl.neotech.fantasy;

public class Goblin extends Orco{

    private  Double molAttacco =1.5;

    @Override
    public void attacca(Ruolo nemico) {
        double attacco=getForzaAttacco()*molAttacco;
        System.out.println("GOBLIN ATTACCA:"+attacco);
        nemico.difendi(attacco);
    }

    @Override
    protected void difendi(Double attacco) {
        double difesa=getForzaDifesa()*molDifesa;
        System.out.println("GOBLIN DIFENDE:"+difesa);
        double danno=difesa-attacco;
        setStamina(getStamina()+(danno));
        System.out.println("GOBLIN STAMINA RESTANTE:"+getStamina());
    }
    
}
