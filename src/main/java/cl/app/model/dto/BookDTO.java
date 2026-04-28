package cl.app.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BookDTO {

    private Long id;
    private String name;
    private String autor;
}