package cl.app.service;

import cl.app.client.MsBooksClient;
import cl.app.model.dto.BookDTO;
import cl.app.model.dto.ReviewDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class ReviewService {

    private HashMap<Long, ReviewDTO> data = new HashMap<>();

    public ReviewService(){
        data.put(1L, new ReviewDTO(1L, "Comentario 1", 1L, null));
        data.put(2L, new ReviewDTO(2L, "Comentario 2", 2L, null));
    }
    @Autowired
    MsBooksClient msBooksClient;

    public List<BookDTO> getAllBooks(){
        return msBooksClient.getAllBooks().getBody();
    }

    public ReviewDTO getReviewById(Long id){
        ReviewDTO reviewDTO =  data.get(id);
        BookDTO bookDTO = msBooksClient.findBookById(reviewDTO.getBookId()).getBody();
        reviewDTO.setBookDto(bookDTO);
        return reviewDTO;
    }

}