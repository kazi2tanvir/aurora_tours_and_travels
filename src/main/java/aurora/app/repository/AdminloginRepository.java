package aurora.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import aurora.app.model.Adminlogin;



@Repository
public interface AdminloginRepository extends CrudRepository<Adminlogin, Long> {
	 @Query("FROM Adminlogin WHERE userid = ?1 AND password = ?2")
	    List<Adminlogin> findByUserAndPassword(String userid, String password);

}
