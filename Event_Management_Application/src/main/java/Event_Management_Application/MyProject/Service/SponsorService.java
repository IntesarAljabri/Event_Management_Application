package Event_Management_Application.MyProject.Service;

import Event_Management_Application.MyProject.Models.Schedule;
import Event_Management_Application.MyProject.Models.Sponsor;
import Event_Management_Application.MyProject.Repositories.ScheduleRepository;
import Event_Management_Application.MyProject.Repositories.SponsorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SponsorService {
    @Autowired
    SponsorRepository sponsorRepository;
    public List<Sponsor> getAllSponsor() {

        return sponsorRepository.findAll();
    }

    public Sponsor getSponsorById(Long id) {

        return sponsorRepository.findById(id).get();
    }
}
