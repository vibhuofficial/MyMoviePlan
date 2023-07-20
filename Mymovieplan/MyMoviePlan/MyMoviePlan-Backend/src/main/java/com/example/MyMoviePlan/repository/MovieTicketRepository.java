package com.example.MyMoviePlan.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.MyMoviePlan.model.MovieTicket;

@Repository
public interface MovieTicketRepository extends JpaRepository<MovieTicket, Long> {
	@Query(value = "SELECT * FROM movie_tickets WHERE movie_name = :movieName", nativeQuery = true)
	public Optional<MovieTicket> getMovieTicketByMovieName(@Param("movieName") String movieName);
}
