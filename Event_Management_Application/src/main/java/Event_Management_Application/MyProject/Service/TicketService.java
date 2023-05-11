package Event_Management_Application.MyProject.Service;

import Event_Management_Application.MyProject.Models.Sponsor;
import Event_Management_Application.MyProject.Models.Ticket;
import Event_Management_Application.MyProject.Repositories.SponsorRepository;
import Event_Management_Application.MyProject.Repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    TicketRepository ticketRepository;
    public List<Ticket> getAllTicket() {

        return ticketRepository.findAll();
    }

    public Ticket getTicketById(Long id) {

        return ticketRepository.findById(id).get();
    }
}
