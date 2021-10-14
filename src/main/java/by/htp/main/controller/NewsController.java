package by.htp.main.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import by.htp.main.entity.News;
import by.htp.main.service.NewsService;

@Controller
@RequestMapping("/news")
public class NewsController {


	// need to inject our customer service
	@Autowired
	private NewsService newsService;
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {

		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/list")
	public String listNews(Model theModel) {
		
		// get customers from the service
		List<News> theNews = newsService.getNews();
				
		// add the customers to the model
		theModel.addAttribute("news", theNews);
		
		return "list-news";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		News theNews = new News();
		
		theModel.addAttribute("news", theNews);
		
		return "news-form";
	}
	
	@PostMapping("/saveNews")
	public String saveNews(@Valid @ModelAttribute("news") News theNews, BindingResult theBindingResult) {
		
		if (theBindingResult.hasErrors()) {
			return "news-form";
		}else {
		newsService.saveNews(theNews);	
		return "redirect:/news/list";
		}
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("newsId") int theId, Model theModel) {
		
		// get the customer from our service
		News theNews = newsService.getNews(theId);	
		
		// set customer as a model attribute to pre-populate the form
		theModel.addAttribute("news", theNews);
		
		// send over to our form		
		return "news-form";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("newsId") int theId) {
		
		// delete the customer
		newsService.deleteNews(theId);
		
		return "redirect:/news/list";
	}
	
	@GetMapping("/showOneNews")
	public String showOneNews(@RequestParam("newsId") int theId,
									Model theModel) {
		
		// get the customer from our service
		News theNews = newsService.getNews(theId);	
		
		// set customer as a model attribute to pre-populate the form
		theModel.addAttribute("news", theNews);
		
		// send over to our form		
		return "one-news";
	}
}










