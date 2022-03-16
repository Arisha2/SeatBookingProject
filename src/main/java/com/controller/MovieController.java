package com.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.dao.MovieDao;
import com.entity.Movie;
import com.entity.Booking;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
@Transactional
@Repository
@EnableWebMvc
@RequestMapping(value = "/movie", method = RequestMethod.GET)
public class MovieController {

	@Autowired
	private MovieDao movieDaoImpl;
	

	@RequestMapping(value = "/list")
	public String listMovies(Model m) {
		System.out.println(" inside Movie Controller inside List method");
		List<Movie> movies = movieDaoImpl.getShowMovie();
		for(Movie m1:movies) {
			System.out.println(m1.toString());
		}
		m.addAttribute("movieslist", movies);
		
		return "index";
	}
	
	@RequestMapping(value = "/book")
	public String BookMovies(@RequestParam("movie_id") int movie_id, Model Model) {
		System.out.println(" inside Movie Controller inside book method");
		System.out.println(movie_id);
		Movie movies = movieDaoImpl.getMovie(movie_id);
		Model.addAttribute("book", movies);
		//System.out.println(movies);
		System.out.println("After model attribute");
		return "bookingseats";
		
	}
	
	@RequestMapping(value = "/listseat")
	public String SeatBooking(int booking_id,Model theModel) {
		System.out.println("In list seats method");
		Booking seat = movieDaoImpl.getAllSeats(booking_id);
		theModel.addAttribute("seats", seat);
		return "bookingseats";
	}
	
	@RequestMapping(value = "/timeslot")
	public String BookSlot(@RequestParam(value="show_date", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)Date show_date, @RequestParam(value="start_time", required = false) String show_time, Model Model) {
		System.out.println(" inside book slot controller");
		System.out.println(show_time);
		System.out.println(show_date);
		Booking booking = movieDaoImpl.getMovie(show_date, show_time);
		Model.addAttribute("slots", booking);
		//System.out.println(movies);
		System.out.println("After model attribute");
		return "bookingseats";
		
	}
	@RequestMapping(value = "/submit")
	public String insertSeats(@RequestParam("seat_no") boolean seat_no[], @RequestParam("show_date") Date show_date , @RequestParam("start_time") String show_time , int movie_id, Model Model) {
		System.out.println("inside insert seat method");
		for(int i=0;i<seat_no.length;i++) {
			Booking seat = movieDaoImpl.getInsert(seat_no[i], show_date, show_time, movie_id);
		Model.addAttribute("insert", seat);
		}
		return "seatsuccess";
	}
	
}
