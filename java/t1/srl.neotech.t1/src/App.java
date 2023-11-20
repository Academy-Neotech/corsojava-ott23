import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class App {
	public static void main(String[] args) {

        
       try {
        File f=new File("/home/neotech/t.txt");
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        int dato=-1;
        while((dato=br.read())!=-1){
                System.out.println(dato);
        }
        br.close();
        fr.close();

        FileWriter fw=new FileWriter(f,true);
        BufferedWriter bw=new BufferedWriter(fw);
        bw.newLine();
        bw.write("asdgsegsdfgsdf");
        bw.close();
        fw.close();;


        

} catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
}
       

	}


    
}