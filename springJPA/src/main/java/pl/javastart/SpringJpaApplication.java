package pl.javastart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.javastart.dao.BookDao;
import pl.javastart.model.Book;


@SpringBootApplication
public class SpringJpaApplication {
    public static void main(String[] args) throws InterruptedException {


        ConfigurableApplicationContext ctx = SpringApplication.run(SpringJpaApplication.class, args);

        //CREATE
        BookDao dao = ctx.getBean(BookDao.class);
        Book book = new Book("1234567890468", "Spring is so cool", "Javastart");
        Book book1 = new Book("2342", "aha", "siema");
        dao.save(book);
        dao.save(book1);

        //UPDATE
        Book book2 = new Book("4", "lol", "ja");
        book2.setId(1L);
        dao.update(book2);

        //READ
        Book findBook = dao.get(2L);
        System.out.println(findBook);

        //Delete
        dao.remove(1L);
        Book book3 = dao.get(1L);
        System.out.println(book3);





    }
}
