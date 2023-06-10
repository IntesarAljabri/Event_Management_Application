package Event_Management_Application.MyProject.Service;

import Event_Management_Application.MyProject.Models.Review;
import Event_Management_Application.MyProject.Models.Schedule;
import Event_Management_Application.MyProject.Repositories.ReviewRepository;
import Event_Management_Application.MyProject.Repositories.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {
    @Autowired
    ScheduleRepository scheduleRepository;
    public List<Schedule> getAllSchedule() {

        return scheduleRepository.findAll();
    }

    public Schedule getScheduleById(Long id) {

        return scheduleRepository.findById(id).get();
    }
}
