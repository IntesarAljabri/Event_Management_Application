package Event_Management_Application.MyProject.Controllers;

import Event_Management_Application.MyProject.Models.Schedule;
import Event_Management_Application.MyProject.Models.Sponsor;
import Event_Management_Application.MyProject.Service.ScheduleService;
import Event_Management_Application.MyProject.Service.SponsorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "sponsor")
public class SponsorController {

    @Autowired
    SponsorService sponsorService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Sponsor> getAllSponsor() {

        return sponsorService.getAllSponsor();
    }
    @GetMapping(value = "getById")
    public Sponsor getSponsorById(@RequestParam Long id) {

        return sponsorService.getSponsorById(id);
    }
}
