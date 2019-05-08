package tong.jeremy.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tong.jeremy.spring5webapp.model.repositories.AuthorRepository;
import tong.jeremy.spring5webapp.model.repositories.BookRepository;

@Controller
public class AuthorController {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public AuthorController(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model){

        model.addAttribute("authors", authorRepository.findAll());
        model.addAttribute("books", bookRepository.findAll());
        return "authors";

    }
}
