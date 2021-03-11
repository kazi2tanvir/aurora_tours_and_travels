package aurora.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aurora.app.model.Roombooking;

@Repository
public interface RoomBookingRepository extends JpaRepository<Roombooking, Long> {

}
