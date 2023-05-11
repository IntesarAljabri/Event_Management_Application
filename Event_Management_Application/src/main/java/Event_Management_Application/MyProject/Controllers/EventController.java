package Event_Management_Application.MyProject.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "event")
public class EventController {

    //    http://localhost:8080/event/getAll
    @Autowired
    EventService eventService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Event> getAllEvents() {

        return eventService.getAllEvents();
    }
    @GetMapping(value = "getById")
    public Event getEventById(@RequestParam Long id) {

        return eventService.getEventById(id);
    }
}
