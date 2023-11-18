package srl.neotech.fantasy;

public class Demone extends NonMorto{

    protected Double molAttacco=2.5;

    @Override
    public void attacca(Ruolo nemico) {
        double attacco=getForzaAttacco()*molAttacco;
        System.out.println("DEMONE ATTACCA:"+attacco);
        nemico.difendi(attacco);        
    }

    @Override
    protected void difendi(Double attacco) {
        double difesa=getForzaDifesa()*molDifesa;
        System.out.println("DEMONE DIFENDE:"+difesa);
        double danno=difesa-attacco;
        setStamina(getStamina()+(danno));
        System.out.println("DEMONE STAMINA RESTANTE:"+getStamina());
    }
    

    
}
