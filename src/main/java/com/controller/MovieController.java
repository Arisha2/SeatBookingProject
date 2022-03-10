package com.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.dao.MovieDao;
import com.entity.Movie;
import com.entity.Seats;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String BookMovies(@RequestParam("id") int id, Model Model) {
		System.out.println(" inside Movie Controller inside book method");
		System.out.println(id);
		Movie movies = movieDaoImpl.getMovie(id);
		Model.addAttribute("book", movies);
		//System.out.println(movies);
		System.out.println("After model attribute");
		return "bookingseats";
		
	}
	
	@RequestMapping(value = "/listseat")
	public String SeatBooking(Model theModel) {
		System.out.println("In list customers method");
		List<Seats> seat = movieDaoImpl.getAllSeats();
		theModel.addAttribute("seats", seat);
		return "bookingseats";
	}
	
	@RequestMapping(value = "/submit")
	public String insertSeats(@RequestParam("seat_no[]") int seat_no[], boolean seat_status, Model Model) {
		System.out.println("inside insert seat method");
		for(int i=0;i<seat_no.length;i++) {
		Seats seat = movieDaoImpl.getInsert(seat_no[i], seat_status);
		Model.addAttribute("insert", seat);}
		return "bookingseats";
	}
}
