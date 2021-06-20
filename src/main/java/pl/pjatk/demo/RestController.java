package pl.pjatk.demo;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rent")
public class RestController {
    private final RentingService rentingService;

    public RestController(RentingService rentingService) {
        this.rentingService = rentingService;
    }

    @ApiOperation(value =  "Find movie by given ID",
    response = Movie.class,
    notes = "Getting movie from provided id")

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Fine"),
            @ApiResponse(code = 404, message = "Movie not found"),
            @ApiResponse(code = 401, message = "You shouldn't see this"),
            @ApiResponse(code = 403, message = "Nope")
    })

    @GetMapping("/{id}")
    public ResponseEntity<Movie> findById(
            @ApiParam(name = "id",
            type = "long",
            value = "100",
            example = "1",
            required = true,
            defaultValue = "1")
            @PathVariable Long id) {
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
