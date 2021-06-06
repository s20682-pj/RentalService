package pl.pjatk.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rent")
public class RestController {
    private final RentingService rentingService;

    public RestController(RentingService rentingService) {
        this.rentingService = rentingService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> findById(@PathVariable Long id) {
        return ResponseEntity.ok(rentingService.findById(id));
    }

    @PutMapping("/return/{id}")
    public ResponseEntity<Movie> returnMovie(@PathVariable Long id){
        return ResponseEntity.ok(rentingService.returnMovie(id));
    }

    @PutMapping("/rent/{id}")
    public ResponseEntity<Movie> rentMovie(@PathVariable Long id){
        return ResponseEntity.ok(rentingService.rentMovie(id));
    }
}
