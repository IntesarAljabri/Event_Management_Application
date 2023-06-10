package Event_Management_Application.MyProject.Repositories;

import Event_Management_Application.MyProject.Models.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepository  extends JpaRepository<Vendor, Long> {
}
