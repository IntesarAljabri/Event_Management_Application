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
@Table(name = "event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String description;
    String date;
    String duration;

    @ManyToOne
    @JoinColumn(name = "venueId", referencedColumnName = "id")
    Venue venue;

    @ManyToOne
    @JoinColumn(name = "organizerId", referencedColumnName = "id")
    Organizer organizer;

    @OneToMany(mappedBy = "event")
    @JsonIgnore
    private List<Ticket> tickets;

    @ManyToMany
    @JoinTable(name = "eventAttendees", joinColumns = @JoinColumn(name = "eventId"), inverseJoinColumns = @JoinColumn(name = "attendeeId"))
    private List<Attendee> attendees;

    @OneToMany(mappedBy = "event")
    @JsonIgnore
    private List<Review> reviews;

    @ManyToMany
    @JoinTable(name = "eventSponsor", joinColumns = @JoinColumn(name = "eventId"), inverseJoinColumns = @JoinColumn(name = "sponsorId"))
    private List<Sponsor> sponsors;

    @ManyToMany
    @JoinTable(name = "eventVendor", joinColumns = @JoinColumn(name = "eventId"), inverseJoinColumns = @JoinColumn(name = "vendorId"))
    private List<Vendor> vendors;

    @OneToMany(mappedBy = "event")
    @JsonIgnore
    private List<Schedule> schedules;
}
