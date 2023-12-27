package it.sogei.devops;

import io.github.shuoros.jterminal.JTerminal;
import io.github.shuoros.jterminal.ansi.Color;

public class Main {
    
    public static void main(String[] args) {
        JTerminal.println("-- DEVOPS CHECK CONFIGMAP --", Color.DARK_BLUE,Color.WHITE);
        String propertiesFile=null;
        try {
            if(args.length>0) propertiesFile=args[0]; 
            else propertiesFile="/home/neotech/Sorgenti/SogeiCHKCMAP/chkcmap.properties";
            JTerminal.print("PROPERTIES FILE:", Color.BLUE_VIOLET);
            JTerminal.println(propertiesFile,Color.WHITE);
        } catch (Exception e) {

            e.printStackTrace();
        }
        
        DevOps devops=new DevOps();
        devops.setPropertiesFile(propertiesFile);

        devops.readPropertiesFile();
        devops.listFileToCheck();
        devops.checkEntries();

    }
 

}