package controller.co3201;

import java.security.Principal;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import service.co3201.ForumService;
import model.co3201.Thread;

@Controller
public class ForumController {

    private ForumService forumService;

    public ForumController(ForumService forumService) {
        this.forumService = forumService;
    }

    @GetMapping("/thread")
    public String getAllThreads(Model model) {
        List<Thread> threads = forumService.getAllThreads();
        Thread newThread = new Thread();
        model.addAttribute("threads", threads);
        model.addAttribute("newThread", newThread);
        return "threads";
    }
    
    @PostMapping("/thread")
    public String addThread(@ModelAttribute Thread thread, Principal principal) {
        forumService.addThread(thread, principal.getName());
        return "redirect:/";
    }
}
