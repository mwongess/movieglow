package dev.mwongess.movies.movies.services;

import dev.mwongess.movies.movies.models.Movie;
import dev.mwongess.movies.movies.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository repository;

    public List<Movie> findAllMovies() {
        return repository.findAll();
    }
}
