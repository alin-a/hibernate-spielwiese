package dev.alinavoss.hibernatespielwiese;

import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer> {
}
