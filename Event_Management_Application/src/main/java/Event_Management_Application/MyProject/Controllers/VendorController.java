package Event_Management_Application.MyProject.Controllers;

import Event_Management_Application.MyProject.Models.Ticket;
import Event_Management_Application.MyProject.Models.Vendor;
import Event_Management_Application.MyProject.Service.TicketService;
import Event_Management_Application.MyProject.Service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "vendor")
public class VendorController {
    @Autowired
    VendorService vendorService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Vendor> getAllVendor() {

        return vendorService.getAllVendor();
    }
    @GetMapping(value = "getById")
    public Vendor getVendorById(@RequestParam Long id) {

        return vendorService.getVendorById(id);
    }
}
