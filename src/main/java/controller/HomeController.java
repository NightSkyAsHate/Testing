package controller;

import instanse.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String getString(Model model){
        model.addAttribute("user", new User());
        return "home";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String lineSubmit(@ModelAttribute User user, Model model){
        boolean flag = User.checkLoginVallidation(user.getLogin()) && User.checkLoginVallidation(user.getPassword());
        model.addAttribute("flag", flag);
        return "home";
    }
}
