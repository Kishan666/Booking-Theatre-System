package za.ac.group2.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.group2.Domain.Movie;
import za.ac.group2.Repository.MovieRepository;
import za.ac.group2.Service.MovieService;

@Component
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieRepository repository;

    @Override
    public Movie save(Movie entity)
    {
        return repository.save(entity);
    }

    @Override
    public Movie findById(String s)
    {
        return repository.findOne(s);
    }

    @Override
    public Movie update(Movie entity)
    {
        return repository.save(entity);
    }

    @Override
    public void delete(Movie entity)
    {
        repository.delete(entity);
    }
}
