package com.BikkadIT.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.BikkadIT.Entity.Book;


@Controller
@RequestMapping("/api")
public class BookController {
	
	@GetMapping(value="/book")
	public String getBook(Model model) {
		Book  b=new Book();
		b.setBookId(101);
		b.setName("java");
		b.setBookPrice(150);
		System.out.println("hellow");
		
		model.addAttribute("book", b);
		return "book";
		
	}

}
