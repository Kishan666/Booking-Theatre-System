package za.ac.group2.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Movie {

    @Id
    private String id;
    private String title;
    private String movieDate;
    private String movieTime;
    private String category;

    public String getId()
    {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getMovieDate() {
        return movieDate;
    }

    public String getMovieTime() {
        return movieTime;
    }

    public String getCategory() {
        return category;
    }

    public Movie()
    {}

    public Movie(Builder builder)
    {
        this.id = builder.id;
        this.title = builder.title;
        this.movieDate = builder.movieDate;
        this.movieTime = builder.movieTime;
        this.category = builder.category;

    }

    public static class Builder {
        private String id;
        private String title;
        private String movieDate;
        private String movieTime;
        private String category;


        public Builder id(String value) {
            this.id = value;
            return this;
        }
        public Builder title(String value){
            this.title = value;
            return  this;
        }
        public Builder movieDate(String value){
            this.movieDate = value;
            return this;
        }
        public Builder movieTime(String value){
            this.movieTime = value;
            return this;
        }
        public Builder category(String value){
            this.category = value;
            return this;
        }


        public Movie build() {
            return new Movie(this);
        }



    }
}
