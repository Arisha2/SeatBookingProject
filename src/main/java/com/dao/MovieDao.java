package com.dao;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.entity.Movie;
import com.entity.Booking;


@Service
public interface MovieDao {
	public List <Movie> getShowMovie();
	public Movie getMovie(int id);
	public List<Booking> getAllSeats();
	public Booking getInsert(boolean seat_no, Date show_date, String showtime, int movie_id);
	
}
