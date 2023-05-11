package Event_Management_Application.MyProject.Repositories;

import Event_Management_Application.MyProject.Models.Venue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenueRepository  extends JpaRepository<Venue, Long> {
}
