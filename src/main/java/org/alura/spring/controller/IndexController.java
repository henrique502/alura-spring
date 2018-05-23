package org.alura.spring.controller;

import org.alura.spring.model.Guest;
import org.alura.spring.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@Autowired
	private GuestRepository repository; 
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/guests")
	public String guests(Model model) {
		Iterable<Guest> guests = repository.findAll();
		model.addAttribute("guests", guests);
		
		return "guests";
	}
	
}
