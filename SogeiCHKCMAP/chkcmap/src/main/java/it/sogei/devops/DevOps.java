package it.sogei.devops;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import io.github.shuoros.jterminal.JTerminal;
import io.github.shuoros.jterminal.ansi.Color;

public class DevOps {

    Properties prop = new Properties();
    Properties keys=new Properties();
    Map<String,String> fileToCheck=new HashMap<String,String>();
    JsonNode dizionario=null;
    
    private String propertiesFile=null;

    public String getPropertiesFile() {
        return propertiesFile;
    }

    public void setPropertiesFile(String propertiesFile) {
        this.propertiesFile = propertiesFile;
    }

    //List file into folders and populate Map
    public Boolean listFileToCheck(){
        try {
            String[] folders=prop.getProperty("CMAP_FOLDERS").split(";");
            for(String folder: folders){
                File directoryPath = new File(folder);
                String files[] = directoryPath.list();
                for(String file:files){
                    if(checkFileExtension(file)){
                        String[] fileNameAndVersion=new String[2];
                        fileNameAndVersion[0]=folder+file.substring(0,file.lastIndexOf("-"));
                        fileNameAndVersion[1]=file.substring(file.lastIndexOf("-"));
                        if(!fileToCheck.containsKey(fileNameAndVersion[0])){
                            fileToCheck.put(fileNameAndVersion[0], fileNameAndVersion[1]);
                        }
                        else {
                            if(fileToCheck.get(fileNameAndVersion[0]).compareTo(fileNameAndVersion[1])<0){
                                fileToCheck.put(fileNameAndVersion[0],fileNameAndVersion[1]);
                            }
                        }

                    }
                }

            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

        return true;
    }

    private Boolean checkFileExtension(String file){
        String[] extensions=prop.getProperty("EXTENSIONS").split(";");
        for(String extension:extensions){
            if(file.endsWith(extension)) return true;
        }
        return false;
    }

    //Read Prop file and load keys
    public Boolean readPropertiesFile(){
        try {
            prop.load(new FileReader(propertiesFile));
             JTerminal.print("DIZIONARIO:",Color.BLUE_VIOLET);
             JTerminal.println(prop.getProperty("DIZIONARIO_CMAP"),Color.WHITE);
             keys.load(new FileReader(prop.getProperty("DIZIONARIO_CMAP")));
        } 
        catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    public Boolean checkEntries(){
        String line;
        try {
            ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
            dizionario=mapper.readTree(new File(prop.getProperty("DIZIONARIO_CMAP")));

            for (String filename:fileToCheck.keySet()) {
                String path=filename+fileToCheck.get(filename);
                JTerminal.print("CHECKING FILE:",Color.GREEN_YELLOW);
                JTerminal.println(path,Color.WHITE);
                BufferedReader bufferreader = new BufferedReader(new FileReader(path));
                while ((line = bufferreader.readLine()) != null) { 
                    if(line.contains("{{") && line.contains("}}")){
                            checkEntry(line);
                    }
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    private void checkEntry(String line){
      String entry=line.substring(line.indexOf("{{")+2,line.indexOf("}}"));
       if(dizionario.findValue(entry)!=null){
        JTerminal.print("KEY NOT FOUND:",Color.RED_2);
        JTerminal.println(entry,Color.WHITE);
       }        

    }


}
