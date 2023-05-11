package Event_Management_Application.MyProject.Models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Data
@Entity
@Table(name = "vendor")
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    Boolean manufacturers_type;
    Boolean wholesalers_type;
    Boolean retailers_type;
    Boolean maintenance_type;
    Boolean service_type;

    @ManyToMany(mappedBy = "vendors")
    @JsonIgnore
    private List<Event> events;

}
