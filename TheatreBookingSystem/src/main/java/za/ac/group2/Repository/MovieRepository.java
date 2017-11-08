package za.ac.group2.Repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.group2.Domain.Movie;

public interface MovieRepository extends CrudRepository<Movie,String>{
}
