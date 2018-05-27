package guru.springframework.spring5weppapp.repository;

import guru.springframework.spring5weppapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
