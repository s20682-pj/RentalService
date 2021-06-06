package pl.pjatk.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("rent")
public class RestController {
    private final RentingService rentingService;

    public RestController(RentingService rentingService) {
        this.rentingService = rentingService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> findById(@PathVariable Long id){
        return ResponseEntity.ok(rentingService.findById(id));
    }
}
