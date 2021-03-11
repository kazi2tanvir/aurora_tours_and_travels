package aurora.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import aurora.app.model.Sign;

@Repository
public interface SignRepository extends CrudRepository<Sign, Long> {
	 @Query("FROM Sign WHERE email = ?1 AND password = ?2")
	    List<Sign> findByEmailAndPassword(String email, String password);

}
