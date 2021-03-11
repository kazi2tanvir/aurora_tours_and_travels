package aurora.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import aurora.app.model.Carrent;

@Repository
public interface CarrentRepository extends CrudRepository<Carrent, Long> {

}
