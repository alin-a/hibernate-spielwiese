package dev.alinavoss.hibernatespielwiese;

import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Find;
import jakarta.data.repository.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

    @Find
    Optional<Book> findByTitle(String title);
}
