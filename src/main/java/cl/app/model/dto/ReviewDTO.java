package cl.app.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ReviewDTO {

    private Long id;
    private String comment;
    private Long bookId;
    private BookDTO bookDto;

}