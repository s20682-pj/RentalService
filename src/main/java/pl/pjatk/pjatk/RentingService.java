package pl.pjatk.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RentingService {
    private final RestTemplate restTemplate;

    public RentingService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Movie findById(Long id){
        Movie forEntity = restTemplate.getForEntity("http://localhost:8080/movie" + id, Movie.class).getBody();
        return forEntity;
    }

    public Movie returnMovie(Long id){
        Movie forEntity = restTemplate.put("http://localhost:8080/movie/return" + id, Movie.class);
        return forEntity;
    }
}
