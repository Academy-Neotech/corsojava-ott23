package srl.neotech.testMVC.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String rottaPrincipale(){
        System.out.println("E' stato chiamato lo slash !!!!!!!");
        return "home";
        
    }


    @GetMapping("/lista")
    public String rottaLista(){
        System.out.println("Ciaooooo43");
        return "listaDemo";
    }

}
