package cl.app.controller;

import cl.app.model.Review;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/review")
public class ReviewController {

    @PostMapping
    public ResponseEntity<Review> addReview(@RequestBody Review review){
        return ResponseEntity.ok(new Review());
    }

}
