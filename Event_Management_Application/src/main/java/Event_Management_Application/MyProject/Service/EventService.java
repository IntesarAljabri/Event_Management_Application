package Event_Management_Application.MyProject.Service;

import Event_Management_Application.MyProject.Models.Attendee;
import Event_Management_Application.MyProject.Models.Event;
import Event_Management_Application.MyProject.Repositories.AttendeeRepository;
import Event_Management_Application.MyProject.Repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    EventRepository eventRepository;
    public List<Event> getAllEvent() {

        return eventRepository.findAll();
    }

    public Event getEventById(Long id) {

        return eventRepository.findById(id).get();
    }
}
