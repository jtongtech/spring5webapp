package tong.jeremy.spring5webapp.model.repositories;

import org.springframework.data.repository.CrudRepository;
import tong.jeremy.spring5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}