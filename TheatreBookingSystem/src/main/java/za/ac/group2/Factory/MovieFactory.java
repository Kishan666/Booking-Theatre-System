package za.ac.group2.Factory;

import za.ac.group2.Domain.Movie;

import java.util.Date;

public class MovieFactory {

    public static Movie buildMovie(String id, String title, String movieDate, String movieTime,String category){
        Movie movie = new Movie.Builder()
                .id(id)
                .title(title)
                .movieDate(movieDate)
                .movieTime(movieTime)
                .category(category)
                .build();

                return movie;

    }


}
