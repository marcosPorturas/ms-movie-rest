package com.pe.web.movie.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pe.web.movie.app.dto.response.MovieResponse;
import com.pe.web.movie.app.service.MovieService;

import io.reactivex.Single;

@RestController
@RequestMapping("/movie")
public class MovieController {

	@Autowired
	MovieService movieService; 
	
	@GetMapping("/all")
	public Single<List<MovieResponse>> getAllMovie(){
		return movieService.getAllMovie();
	}
	
	@GetMapping("/{codMovie}")
	public Single<MovieResponse> getMovieResponse(@PathVariable("codMovie")Integer codMovie){
		return movieService.getMovieResponse(codMovie);
	}
	
}
