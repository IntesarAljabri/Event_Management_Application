package Event_Management_Application.MyProject.Models;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String typeVipGeneral;
    Double price;
    Integer quantity;
    String saleStartDate;
    String saleEndDate;

    @ManyToOne
    @JoinColumn(name = "eventId", referencedColumnName = "id")
    Event event;
}
