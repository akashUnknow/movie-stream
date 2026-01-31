package com.AkashD.movie_stream.repo;

import com.AkashD.movie_stream.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> {
}
