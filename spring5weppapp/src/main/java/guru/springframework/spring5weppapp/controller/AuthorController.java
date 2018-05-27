package guru.springframework.spring5weppapp.controller;

import guru.springframework.spring5weppapp.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    AuthorRepository authorRepository;

    @Autowired
    PropertyConfig propertyConfig;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        model.addAttribute("gtsfi", propertyConfig.getGtsfi());
        return "authors";
    }

}
