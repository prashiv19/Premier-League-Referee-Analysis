package controller.co3201;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import repo.co3201.UserRepository;
 
@Controller
public class LoginController {
 
    @Autowired
    private UserRepository userRepo;
     
    @GetMapping("/")
    public String viewHomePage() {
        return "index";
    }
}