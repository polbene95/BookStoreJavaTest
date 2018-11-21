package bookstore.bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookStoreController {
    @Autowired
    private AuthorRepository authorRespository;
    @Autowired
    private BookRepository bookRepository;


}
