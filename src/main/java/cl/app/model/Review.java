package cl.app.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Review {

    private int id;
    private String review;
    private int bookId;
}
