package com.filter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filter.models.Figure;

public interface FigureRepository extends JpaRepository<Figure, Integer> {

}
