package Event_Management_Application.MyProject.Controllers;

import Event_Management_Application.MyProject.Models.Review;
import Event_Management_Application.MyProject.Models.Schedule;
import Event_Management_Application.MyProject.Service.ReviewService;
import Event_Management_Application.MyProject.Service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "schedule")
public class ScheduleController {
    @Autowired
    ScheduleService scheduleService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Schedule> getAllSchedule() {

        return scheduleService.getAllSchedule();
    }
    @GetMapping(value = "getById")
    public Schedule getScheduleById(@RequestParam Long id) {

        return scheduleService.getScheduleById(id);
    }
}
