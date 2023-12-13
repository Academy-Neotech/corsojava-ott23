package srl.neotech;

import com.github.javafaker.Faker;
import com.github.tomaslanger.chalk.Chalk;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Faker f=new Faker();
        
        System.out.println(Chalk.on(f.nation().capitalCity()).bgBlue().underline());
    }
}