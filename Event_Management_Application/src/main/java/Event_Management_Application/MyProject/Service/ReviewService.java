package Event_Management_Application.MyProject.Service;

import Event_Management_Application.MyProject.Models.Organizer;
import Event_Management_Application.MyProject.Models.Review;
import Event_Management_Application.MyProject.Repositories.OrganizerRepository;
import Event_Management_Application.MyProject.Repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    @Autowired
    ReviewRepository reviewRepository;
    public List<Review> getAllReview() {

        return reviewRepository.findAll();
    }

    public Review getReviewById(Long id) {

        return reviewRepository.findById(id).get();
    }
}
