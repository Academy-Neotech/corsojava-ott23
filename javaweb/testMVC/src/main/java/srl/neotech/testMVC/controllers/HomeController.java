package srl.neotech.testMVC.controllers;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import srl.neotech.testMVC.model.Automobile;

@Controller
public class HomeController {

    @GetMapping("/")
    public String rottaPrincipale(){
        System.out.println("E' stato chiamato lo slash !!!!!!!");
        return "home";
        
    }


    @GetMapping("/lista")
    public String rottaLista(@RequestParam("val1") Integer valore, @RequestParam("val2") Integer moltiplicatore, Model binding){
        Integer risultato=valore*moltiplicatore;
        binding.addAttribute("risultatoBinding", risultato);

        Automobile auto=new Automobile();
        auto.setCilindrata(4000);
        auto.setTarga("WD456RT");
        auto.setMarca("BMW");
        auto.setColore("Rosso");
        auto.setModello("Q8");
        Random r=new Random();
        int immagine=r.nextInt(100);
        if(immagine>90)
            auto.setImg("https://www.lamborghini.com/sites/it-en/files/DAM/lamborghini/facelift_2019/models_gw/2023/03_29_revuelto/gate_models_s_02_m.jpg");
         else if(immagine>50)
            auto.setImg("https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/2014-03-04_Geneva_Motor_Show_1377.JPG/1200px-2014-03-04_Geneva_Motor_Show_1377.JPG");
        else if(immagine>30)
            auto.setImg("https://images.netdirector.co.uk/gforces-auto/image/upload/q_auto,c_fill,f_auto,fl_lossy,w_1920,h_1080/auto-client/ddd052485e38c12b891a37a1ca3b6981/11_03_hura_evo_fluo_family_01.png");
        else auto.setImg("https://bsmedia.business-standard.com/_media/bs/img/article/2020-12/18/full/1608302898-1142.jpg");
        binding.addAttribute("autoBinding", auto);

        return "listaDemo";
    }

}
