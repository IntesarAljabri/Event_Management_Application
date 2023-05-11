package Event_Management_Application.MyProject.Repositories;

import Event_Management_Application.MyProject.Models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository  extends JpaRepository<Ticket, Long> {
}
