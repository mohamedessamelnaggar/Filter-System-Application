package com.filter.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.filter.models.Figure;
import com.filter.services.FigureService;

@Controller
public class FigureController {
	
	
	@Autowired
	private FigureService figureService ;
	
	
	@GetMapping("/figures")
	public String getFigures(Model model) {
		
		List<Figure> figureList = figureService.getFigures();
		
		model.addAttribute("figures" , figureList);
		
		return "figure";
	}
	
	@PostMapping("/figures/addNew")
	public String addNew(Figure figure) {
		figureService.save(figure);
		return "redirect:/figures";
		
	}
	
	@RequestMapping("figures/findById")
	@ResponseBody
	public Optional<Figure> findById(int id) {
	  return	figureService.findById(id);
	}
	
	@RequestMapping(value = "/figures/update" , method = {RequestMethod.PUT , RequestMethod.GET})
	public String update(Figure figure) {
		figureService.save(figure);
		return "redirect:/figures";
	}
	

}
