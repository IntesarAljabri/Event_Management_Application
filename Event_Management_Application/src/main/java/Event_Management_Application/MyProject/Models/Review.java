package Event_Management_Application.MyProject.Models;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Integer ratingOutOf5;
    String comment;

    @ManyToOne
    @JoinColumn(name = "eventId", referencedColumnName = "id")
    Event event;
}
