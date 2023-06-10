package Event_Management_Application.MyProject.Controllers;

import Event_Management_Application.MyProject.Models.Vendor;
import Event_Management_Application.MyProject.Models.Venue;
import Event_Management_Application.MyProject.Service.VendorService;
import Event_Management_Application.MyProject.Service.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "venue")
public class VenueController {
    @Autowired
    VenueService venueService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Venue> getAllVenue() {

        return venueService.getAllVenue();
    }
    @GetMapping(value = "getById")
    public Venue getVenueById(@RequestParam Long id) {

        return venueService.getVenueById(id);
    }
}
