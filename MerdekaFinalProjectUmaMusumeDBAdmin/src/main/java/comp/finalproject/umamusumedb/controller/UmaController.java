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

    @GetMapping("/newUma")
    public String newUma(Model model) {
        // create model attribute to bind form data
        Uma uma = new Uma();
        model.addAttribute("uma", uma);
        return "new_uma";
    }

    @PostMapping("/saveUma")
    public String saveUma(@ModelAttribute("uma") Uma uma) {
        // save uma to database
        umaService.saveUma(uma);
        return "redirect:/uma";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
        // get uma from the service
        Uma uma = umaService.getUmaById(id);

        // set uma as a model attribute to pre-populate the form
        model.addAttribute("uma", uma);
        return "update_uma";
    }

    @GetMapping("/deleteUma/{id}")
    public String deleteUma(@PathVariable(value = "id") long id, Model model) {
        // call delete uma method
        this.umaService.deleteUmaById(id);
        return "redirect:/uma";
    }

}
