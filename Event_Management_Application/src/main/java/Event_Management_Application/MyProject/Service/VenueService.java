package Event_Management_Application.MyProject.Service;

import Event_Management_Application.MyProject.Models.Vendor;
import Event_Management_Application.MyProject.Models.Venue;
import Event_Management_Application.MyProject.Repositories.VendorRepository;
import Event_Management_Application.MyProject.Repositories.VenueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VenueService {
    @Autowired
    VenueRepository venueRepository;
    public List<Venue> getAllVenue() {

        return venueRepository.findAll();
    }

    public Venue getVenueById(Long id) {

        return venueRepository.findById(id).get();
    }
}
