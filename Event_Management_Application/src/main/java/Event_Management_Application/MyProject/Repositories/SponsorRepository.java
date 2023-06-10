package Event_Management_Application.MyProject.Repositories;

import Event_Management_Application.MyProject.Models.Sponsor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SponsorRepository  extends JpaRepository<Sponsor, Long> {
}
