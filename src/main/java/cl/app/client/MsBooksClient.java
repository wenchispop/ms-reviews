package cl.app.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name ="", url = "http://localhost:8181")

public interface MsBooksClient {
    @GetMapping
    public ResponseEntity<String> getSaludo();
}
