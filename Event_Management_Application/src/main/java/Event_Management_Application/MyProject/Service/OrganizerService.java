package Event_Management_Application.MyProject.Service;

import Event_Management_Application.MyProject.Models.Event;
import Event_Management_Application.MyProject.Models.Organizer;
import Event_Management_Application.MyProject.Repositories.EventRepository;
import Event_Management_Application.MyProject.Repositories.OrganizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizerService {
    @Autowired
    OrganizerRepository organizerRepository;
    public List<Organizer> getAllOrganizer() {

        return organizerRepository.findAll();
    }

    public Organizer getOrganizerById(Long id) {

        return organizerRepository.findById(id).get();
    }
}
