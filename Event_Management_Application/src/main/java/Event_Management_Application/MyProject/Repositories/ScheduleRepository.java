package Event_Management_Application.MyProject.Repositories;

import Event_Management_Application.MyProject.Models.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository  extends JpaRepository<Schedule, Long> {
}
