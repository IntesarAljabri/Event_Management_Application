package Event_Management_Application.MyProject.Controllers;

import Event_Management_Application.MyProject.Models.Organizer;
import Event_Management_Application.MyProject.Models.Review;
import Event_Management_Application.MyProject.Service.OrganizerService;
import Event_Management_Application.MyProject.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "organizer")
public class ReviewController {
    @Autowired
    ReviewService reviewService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Review> getAllReview() {

        return reviewService.getAllReview();
    }
    @GetMapping(value = "getById")
    public Review getReviewById(@RequestParam Long id) {

        return reviewService.getReviewById(id);
    }
}
