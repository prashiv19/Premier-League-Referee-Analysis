package controller.co3201;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import model.co3201.RefereeData;
import repo.co3201.RefereeDataRepository;

@Controller
public class RefereeController {
	
    @Autowired
    private RefereeDataRepository refereedataRepository;
    
    @GetMapping("/data")
    public String getData(Model model) {
        List<RefereeData> dataList = refereedataRepository.findAll();
        model.addAttribute("dataList", dataList);
        return "data.html";
    }
}


