import com.github.javafaker.Faker;

public class App {
    public  static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
     
         Faker f=new Faker();
 
         System.out.println(f.name().fullName());


    }
}
