package guru.springframework.spring5weppapp.repository;

import guru.springframework.spring5weppapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
