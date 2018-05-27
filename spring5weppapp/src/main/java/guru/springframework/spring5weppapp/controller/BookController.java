package guru.springframework.spring5weppapp.controller;

import guru.springframework.spring5weppapp.repository.PublisherRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private PublisherRepository publisherRepository;

    public BookController(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {

        model.addAttribute("books", publisherRepository.findAll());
        //model.addAttribute("gtsfi", "testproperty");
        return "books";
    }

}
