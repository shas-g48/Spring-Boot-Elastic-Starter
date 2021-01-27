package com.shnk.BrainsSpringElastic.Book;

import com.shnk.BrainsSpringElastic.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepository bookrepo;

    @RequestMapping("/bookHi")
    public String bookHi(){
        System.out.println("bookHi");
        return "bookHi";
    }

    @RequestMapping("/book/title/{title}")
    public List<Book> bookViewTitle(@PathVariable("title") String title){
        return bookrepo.findByTitle(title);
    }

    @RequestMapping("/book/author/{author}")
    public List<Book> bookViewAuthor(@PathVariable("author") String author){
        return bookrepo.findByAuthor(author);
    }
}
