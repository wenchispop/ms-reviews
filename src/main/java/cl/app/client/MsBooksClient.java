package cl.app.client;

import cl.app.model.dto.BookDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@FeignClient(name = "ms-books", url = "http://localhost:8181")
public interface MsBooksClient {

    // Obtener todos los libros
    @GetMapping("/api/v1/books")
    ResponseEntity<List<BookDTO>> getAllBooks();

    // Obtener un libro por ID
    @GetMapping("/api/v1/books/{id}")
    ResponseEntity<BookDTO> findBookById(@PathVariable Long id);

    // Crear un nuevo libro
    @PostMapping("/api/v1/books")
    ResponseEntity<BookDTO> createBook(@RequestBody BookDTO book);

    // Actualizar parcialmente (PATCH)
    @PatchMapping("/api/v1/books/{id}")
    ResponseEntity<BookDTO> patchBook(@PathVariable("id") Long id, @RequestBody BookDTO book);

    // Eliminar un libro
    @DeleteMapping("/api/v1/books/{id}")
    ResponseEntity<Void> deleteBook(@PathVariable("id") Long id);


}