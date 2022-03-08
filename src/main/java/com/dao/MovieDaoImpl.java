package com.dao;

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
import com.entity.Seats;

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
        return list;
    }
	
	@Override
	public List<Movie> getMovies(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery < Movie > cq = cb.createQuery(Movie.class);
        Root < Movie > root = cq.from(Movie.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        List <Movie> list=query.getResultList();
        return list;
	}

	@Override
	public Movie getMovie(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Movie movie = session.byId(Movie.class).load(id);
		//System.out.println(movie);
		return movie;
	}
	
	@Override
	public List<Seats> getAllSeats() {
	Session session = sessionFactory.getCurrentSession();
	CriteriaBuilder cb = session.getCriteriaBuilder();
	CriteriaQuery<Seats> cq = cb.createQuery(Seats.class);
	Root<Seats> root = cq.from(Seats.class);
	cq.select(root);
	Query query = session.createQuery(cq);
	return query.getResultList();
	}

	@Override
	public Seats getSeat_No(int seat_no) {
	// TODO Auto-generated method stub
	return null;
	}

	public Seats getInsert(int seat_no, boolean seat_status) {
		System.out.println("inside MoviedaoImpl class inside insert seat method ");
		Seats s = new Seats();
		s.setSeat_no(seat_no);
		s.setSeat_status(true);
		Session session = sessionFactory.getCurrentSession();
		session.update(s);
		return s;
		
	}

}
