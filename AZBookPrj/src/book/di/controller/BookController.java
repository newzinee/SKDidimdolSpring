package book.di.controller;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import book.di.dao.BookDao;
import book.di.vo.BookVO;

@Controller
public class BookController {
	
	@Autowired
	BookDao dao;
	Calendar cal;
	
	@RequestMapping("/getBookList.do")
	public ModelAndView getBookList(Model model) {
		List<BookVO> bookList = dao.readAll();
		System.out.println(bookList);
		return new ModelAndView("bookList.jsp", "bookList", bookList);
	}
	
	@RequestMapping("/insertBookForm.do")
	public ModelAndView insertBookForm() {

		return new ModelAndView("insertBook.jsp");
	}
	
	@RequestMapping("/insertBook.do")
	public String insertBook(@ModelAttribute BookVO book) {
		cal = Calendar.getInstance();
		Date createTime = new Date(cal.getTimeInMillis());
		if(book != null) {
			book.setCreateTime(createTime);
			dao.insert(book);
		}
		return "redirect:/getBookList.do";
	}
	
	@RequestMapping("/deleteBook.do")
	public String deleteBook(@RequestParam int seq) {
		dao.delete(seq);
		return "redirect:/getBookList.do";
	}
	
	@RequestMapping("/updateBookForm.do")
	public ModelAndView updateBook(@RequestParam int seq) {
		BookVO book = dao.read(seq);
		return new ModelAndView("updateBook.jsp", "book", book);
	}
	
	@RequestMapping("/updateBook.do")
	public String updateBook(@ModelAttribute BookVO book) {
		dao.update(book);
		return "redirect:/getBookList.do";
	}
}
