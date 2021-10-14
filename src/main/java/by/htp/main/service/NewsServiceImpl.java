package by.htp.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.htp.main.dao.NewsDAO;
import by.htp.main.entity.News;

@Service
public class NewsServiceImpl implements NewsService {
   
	@Autowired 
	private NewsDAO newsDAO;
	
	@Transactional
	public List<News> getNews() {
		return newsDAO.getNews();
	}
    
	@Transactional
	public void saveNews(News theNews) {
		newsDAO.saveNews(theNews);
		
	}
    
	@Transactional
	public News getNews(int theId) {
		return newsDAO.getNews(theId);
	}
    
	@Transactional
	public void deleteNews(int theId) {
		newsDAO.deleteNews(theId);
	}

}
