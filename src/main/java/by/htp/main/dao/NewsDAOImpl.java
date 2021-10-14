package by.htp.main.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.htp.main.entity.News;

@Repository
public class NewsDAOImpl implements NewsDAO {
   
	@Autowired
	private SessionFactory sessionFactory;
	public List<News> getNews() {
		
		Session currentSession = sessionFactory.getCurrentSession();
						
		// create a query  ... sort by last name
		Query<News> theQuery = 
		currentSession.createQuery("from News order by title",News.class);
				
		// execute query and get result list
		List<News> news = theQuery.getResultList();
				
		return news;
	}

	public void saveNews(News theNews) {
		
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// save/upate the customer ... finally LOL
		currentSession.saveOrUpdate(theNews);
		
	}

	public News getNews(int theId) {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// now retrieve/read from database using the primary key
		News theNews = currentSession.get(News.class, theId);
				
		return theNews;
	}

	public void deleteNews(int theId) {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// delete object with primary key
		Query theQuery = currentSession.createQuery("delete from News where id=:NewsId");
		theQuery.setParameter("NewsId", theId);
				
		theQuery.executeUpdate();	
		
	}

}
