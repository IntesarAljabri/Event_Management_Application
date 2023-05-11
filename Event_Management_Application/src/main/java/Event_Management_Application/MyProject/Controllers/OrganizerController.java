package Event_Management_Application.MyProject.Controllers;
import Event_Management_Application.MyProject.Models.Organizer;
import Event_Management_Application.MyProject.Service.OrganizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "organizer")
public class OrganizerController {

    @Autowired
    OrganizerService organizerService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Organizer> getAllOrganizer() {

        return organizerService.getAllOrganizer();
    }
    @GetMapping(value = "getById")
    public Organizer getOrganizerById(@RequestParam Long id) {

        return organizerService.getOrganizerById(id);
    }
}
