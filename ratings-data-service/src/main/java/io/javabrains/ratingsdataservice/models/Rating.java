package io.javabrains.ratingsdataservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rating {
    public int movieId;
    public int rating;

}
