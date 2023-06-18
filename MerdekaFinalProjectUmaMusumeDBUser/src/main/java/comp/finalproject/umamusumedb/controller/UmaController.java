package comp.finalproject.umamusumedb.controller;

import comp.finalproject.umamusumedb.entity.Uma;
import comp.finalproject.umamusumedb.service.UmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UmaController {

    @Autowired
    private UmaService umaService;

    @GetMapping("/uma")
    public String viewHomePage(Model model) {
        model.addAttribute("umas", umaService.getAllUmas());
        return "uma";
    }

}
