package pl.pjatk.demo;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RentingService {
    private final RestTemplate restTemplate;

    public RentingService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Movie findById(Long id) {
        Movie forEntity = restTemplate.getForEntity("http://localhost:8080/movies/" + id, Movie.class).getBody();
        return forEntity;
    }

    public Movie returnMovie(Long id) {
        Movie forEntity = restTemplate.exchange("http://localhost:8080/movies/return/" + id, HttpMethod.PUT, null,Movie.class).getBody();
        return forEntity;
    }

    public Movie rentMovie(Long id) {
        Movie forEntity = restTemplate.exchange("http://localhost:8080/movies/rent/" + id, HttpMethod.PUT, null,Movie.class).getBody();
        return forEntity;
    }
}
