package com.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.entity.Movie;
import com.entity.Seats;


@Service
public interface MovieDao {
	public List <Movie> getShowMovie();
	//public ShowMovie getShowMovie(String name);
	//public ShowMovie getMovies();
	public List <Movie> getMovies(int id);
	//public List<ShowMovie> getMovies(String movie_name);
	public Movie getMovie(int id);
	public List<Seats> getAllSeats();
	public Seats getSeat_No(int seat_no);
	public Seats getInsert(int seat_no, boolean seat_status);
}
