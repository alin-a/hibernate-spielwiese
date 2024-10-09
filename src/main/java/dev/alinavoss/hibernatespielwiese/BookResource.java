package dev.alinavoss.hibernatespielwiese;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("books")
public class BookResource {

    @Inject
    private AuthorRepository authorRepository;
    @Inject
    private BookRepository bookRepository;


    @POST
    public void createBookAndAuthor() {
        create();
    }

    private void create() {
        Author author = new Author();
        author.setId(1);
        author.setName("J.R.R. Tolkien");
        Author tolkien = authorRepository.save(author);

        Book book = new Book();
        book.setId(2);
        book.setAuthor(tolkien);
        book.setTitle("The Hobbit");
        bookRepository.save(book);
    }

    @GET
    @Path("book")
    @Produces("application/json")
    public Book fetchBook() {
        return bookRepository.findAll().toList().get(0);
    }

}
