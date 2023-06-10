package Event_Management_Application.MyProject.Controllers;

import Event_Management_Application.MyProject.Models.Sponsor;
import Event_Management_Application.MyProject.Models.Ticket;
import Event_Management_Application.MyProject.Service.SponsorService;
import Event_Management_Application.MyProject.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "ticket")
public class TicketController {

    @Autowired
    TicketService ticketService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Ticket> getAllTicket() {

        return ticketService.getAllTicket();
    }
    @GetMapping(value = "getById")
    public Ticket getTicketById(@RequestParam Long id) {

        return ticketService.getTicketById(id);
    }
}
