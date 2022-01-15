package com.tours.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/tours")
@RestController
public class ToursController {

	@RequestMapping(value = "/getAllTours", method = RequestMethod.GET)
	public void getAllTours() {
		System.out.println("I am here");
	}
}
