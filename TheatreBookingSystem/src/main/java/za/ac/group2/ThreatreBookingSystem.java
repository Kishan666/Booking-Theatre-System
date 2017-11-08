package za.ac.group2;


import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.group2.Domain.Movie;
import za.ac.group2.Factory.MovieFactory;
import za.ac.group2.Service.Impl.MovieServiceImpl;

import java.util.Date;

@CrossOrigin(origins = "http://localhost:8080/")
@RestController
@RequestMapping(path = "/TheatreBookingSystem")
public class ThreatreBookingSystem {


    @Autowired
    private MovieServiceImpl movieService;

    //******************************************Movie***************************************
    @GetMapping(path = "addMovie/{id}/{title}/{movieDate}/{movieTime}/{category}")
    public @ResponseBody String addMovie(@PathVariable String id, @PathVariable String title, @PathVariable String movieDate, @PathVariable String movieTime, @PathVariable String category)
    {
        Movie addMovie = MovieFactory.buildMovie(id, title, movieDate, movieTime,category);
        movieService.save(addMovie);
        return new Gson().toJson(addMovie);
    }

    @GetMapping(path = "readMovie/{id}")
    public @ResponseBody String readMovie(@PathVariable String id)
    {
        Movie readMovie = movieService.findById(id);
        return new Gson().toJson(readMovie);
    }

    @GetMapping(path = "updateMovie/{id}/{title}/{movieDate}/{movieTime}/{category}")
    public @ResponseBody String updateMovie(@PathVariable String id, @PathVariable String title, @PathVariable String movieDate, @PathVariable String movieTime, @PathVariable String category)
    {
        Movie updateMovie = movieService.findById(id);

        if(updateMovie == null)
        {
            return new Gson().toJson("Record does not exist");
        }

        Movie movie = MovieFactory.buildMovie(id, title, movieDate, movieTime,category);
        movieService.update(movie);
        return new Gson().toJson(movie);
    }
    @GetMapping(path = "deleteMovie/{id}")
    public @ResponseBody void deleteMovie(@PathVariable String id) {
        Movie deleteMovie = movieService.findById(id);
        if (deleteMovie == null) {
            System.out.println("Record does not exist");
        } else {
            movieService.delete(deleteMovie);
            System.out.println("Record deleted");
        }
    }



}
