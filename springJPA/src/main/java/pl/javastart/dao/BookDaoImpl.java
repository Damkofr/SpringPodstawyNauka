package pl.javastart.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.javastart.model.Book;

import javax.persistence.*;


@Repository
@javax.transaction.Transactional
public class BookDaoImpl implements BookDao {


    @PersistenceContext
    private EntityManager entityManager;


    public BookDaoImpl(){

    }

    @Override
    public void save(Book book) {
        entityManager.persist(book);
    }

    @Override
    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public Book get(Long id) {
        Book book = entityManager.find(Book.class, id);
        return book;
    }

    @Override
    @org.springframework.transaction.annotation.Transactional
    public void update(Book book) {
        // wyszukujemy obiekt w bazie
        Book find = entityManager.find(Book.class, book.getId());
        if (find != null) {
            find.setTitle(book.getTitle());
            find.setIsbn(book.getIsbn());
            find.setAuthor(book.getAuthor());
        }
    }

    @Override
    @Transactional
    public void remove(Long bookId) {
        Book objToRemove = entityManager.find(Book.class, bookId);
        entityManager.remove(objToRemove);
    }
}
