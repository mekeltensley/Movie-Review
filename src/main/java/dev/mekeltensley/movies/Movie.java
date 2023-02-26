package dev.mekeltensley.movies;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document (collection = "movies")
/* This annotation lets the framework know that this class
*  should present each document in the movies collection */
public class Movie {
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
}
