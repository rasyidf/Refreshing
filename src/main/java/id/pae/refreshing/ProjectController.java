package id.pae.refreshing;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProjectController {

    @RequestMapping("/")     // handle return langsung apa adanya, tidak ada styling
    @ResponseBody()
    public String index(){
        return "{ \"pesan\" : \"Hello Dunia\"}";
    }


    @RequestMapping("/welcome") // Kalau pakai thymeleaf
    public String WelcomePage(Model model){
        // Inject data ke model
        model.addAttribute("msg" , "Hello world" );
        model.addAttribute("nama" , "Damar" );
        // Tampilkan template hello.html
        return "hello";
    }
}
