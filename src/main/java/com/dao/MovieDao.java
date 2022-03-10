package com.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.entity.Movie;
import com.entity.Seats;


@Service
public interface MovieDao {
	public List <Movie> getShowMovie();
	public Movie getMovie(int id);
	public List<Seats> getAllSeats();
	public Seats getInsert(int seat_no, boolean seat_status);
}
