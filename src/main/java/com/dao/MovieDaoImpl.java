package com.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.entity.Movie;
import com.entity.Booking;

@Transactional
@Repository
@Service
public class MovieDaoImpl implements MovieDao{
	@Autowired
    private SessionFactory sessionFactory;
	
	@Autowired
    private MovieDao MovieDAO;
	
	@SuppressWarnings("unchecked")
	@Override
    public List < Movie > getShowMovie() {
    	System.out.println("inside MoviedaoImpl class inside list movie method ");
    	
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery < Movie > cq = cb.createQuery(Movie.class);
        Root < Movie > root = cq.from(Movie.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        List <Movie> list=query.getResultList();
        System.out.println(list.toString()+list.size());
        return list;
    }
	

	@Override
	public Movie getMovie(int movie_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Movie movie = session.byId(Movie.class).load(movie_id);
		//System.out.println(movie);		
		return movie;
	}
	
	@Override
	public Booking getAllSeats(int booking_id) {
		Session session = sessionFactory.getCurrentSession();
		Booking book = session.byId(Booking.class).load(booking_id);
		return book;
	}

	

	public Booking getInsert(boolean seat_no, Date show_date, String showtime, int movie_id) {
		System.out.println("inside MoviedaoImpl class inside insert seat method ");
		Booking s = new Booking();
//		s.setSeat_no(seat_no);
//		s.setSeat_status(true);
		s.setShow_date(show_date);
		s.setShow_time(showtime);
		s.getMovie_id();
		s.setMovie_id(movie_id);
		
		Session session = sessionFactory.getCurrentSession();
		session.update(s);		
		return s;
		
	}


	@Override
	public Booking getMovie(int movie_id,Date show_date, String show_time) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		//Movie movie = session.byId(Movie.class).load(movie_id);
		Booking booking = session.byId(Booking.class).load(show_time);
		return booking;
	}

}
