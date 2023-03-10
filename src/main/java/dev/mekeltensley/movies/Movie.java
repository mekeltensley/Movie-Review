package dev.mekeltensley.movies;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document (collection = "movies")
/* This annotation lets the framework know that this class
*  should present each document in the movies collection */
@Data // Comes from the lombok project library, useful for generating getter and setters
@AllArgsConstructor // Annotation for a constructor that takes the private fields as an argument
@NoArgsConstructor // Annotation that takes no parameters
public class Movie {
    @Id
    // This annotation lets the framework know that the ObjectId instance variable is the
    // unique identifier of the object within the database
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference
    //This annotation will allow the database to store only the ID of the review and
    // the reviews will be in a separate collection
    private List<Review> reviewIds;
}
