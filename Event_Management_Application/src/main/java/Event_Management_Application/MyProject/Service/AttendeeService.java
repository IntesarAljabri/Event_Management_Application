package Event_Management_Application.MyProject.Service;

import Event_Management_Application.MyProject.Models.Attendee;
import Event_Management_Application.MyProject.Repositories.AttendeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendeeService {
    @Autowired
    AttendeeRepository attendeeRepository;
    public List<Attendee> getAllAttendee() {

        return attendeeRepository.findAll();
    }

    public Attendee getAttendeeById(Long id) {

        return attendeeRepository.findById(id).get();
    }
}
