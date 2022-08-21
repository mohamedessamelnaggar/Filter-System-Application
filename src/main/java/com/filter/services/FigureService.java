package com.filter.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.filter.models.Figure;
import com.filter.repositories.FigureRepository;

@Service
public class FigureService {
	
	@Autowired
	private FigureRepository figureRepository ;
	
	public List<Figure> getFigures(){
	return figureRepository.findAll();
				
	}
	
	public void save(Figure figure) {
	   figureRepository.save(figure);
	}
	
	public Optional <Figure> findById(int id) {
	  return figureRepository.findById(id);
	}
	

}
