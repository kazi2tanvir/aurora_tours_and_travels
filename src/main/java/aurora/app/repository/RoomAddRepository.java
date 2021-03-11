package aurora.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import aurora.app.model.Roomadd;

@Repository
public interface RoomAddRepository extends CrudRepository<Roomadd, Long> {

}
