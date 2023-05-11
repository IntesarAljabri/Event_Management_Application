package Event_Management_Application.MyProject.Controllers;
import Event_Management_Application.MyProject.Models.Event;
import Event_Management_Application.MyProject.Service.EventService;
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

        return eventService.getAllEvent();
    }
    @GetMapping(value = "getById")
    public Event getEventById(@RequestParam Long id) {

        return eventService.getEventById(id);
    }
}
