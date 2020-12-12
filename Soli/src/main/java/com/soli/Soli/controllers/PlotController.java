package com.soli.Soli.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.soli.Soli.services.PlotService;

@Controller
public class PlotController {

	@Autowired
	PlotService plotService;
	
	@GetMapping("/plot")
	public String getPlot() {
		
		return "T";
	}
}
