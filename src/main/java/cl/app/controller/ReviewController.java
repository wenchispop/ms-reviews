package cl.app.controller;

import cl.app.model.dto.BookDTO;
import cl.app.model.dto.ReviewDTO;
import cl.app.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/review")
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @GetMapping("/books")
    public ResponseEntity<List<BookDTO>> getAllBooks(){
        return ResponseEntity.ok(reviewService.getAllBooks());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReviewDTO> getReviewById(@PathVariable Long id){
        return ResponseEntity.ok(reviewService.getReviewById(id));
    }
}