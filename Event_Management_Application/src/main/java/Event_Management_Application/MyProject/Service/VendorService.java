package Event_Management_Application.MyProject.Service;

import Event_Management_Application.MyProject.Models.Ticket;
import Event_Management_Application.MyProject.Models.Vendor;
import Event_Management_Application.MyProject.Repositories.TicketRepository;
import Event_Management_Application.MyProject.Repositories.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorService {
    @Autowired
    VendorRepository vendorRepository;
    public List<Vendor> getAllVendor() {

        return vendorRepository.findAll();
    }

    public Vendor getVendorById(Long id) {

        return vendorRepository.findById(id).get();
    }
}
