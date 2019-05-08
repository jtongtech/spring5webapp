package tong.jeremy.spring5webapp.model.repositories;

import org.springframework.data.repository.CrudRepository;
import tong.jeremy.spring5webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
