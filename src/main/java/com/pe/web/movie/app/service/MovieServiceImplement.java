package com.pe.web.movie.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.web.movie.app.builder.ConverBuilderMovie;
import com.pe.web.movie.app.dto.response.MovieResponse;
import com.pe.web.movie.app.entity.Movie;
import com.pe.web.movie.app.repository.MovieRepository;

import io.reactivex.Observable;
import io.reactivex.Single;

@Service
public class MovieServiceImplement implements MovieService{

	@Autowired
	MovieRepository movieRepository;

	public MovieResponse invokeMovieBuilder(Movie movie) {
		ConverBuilderMovie convert = new ConverBuilderMovie();
		return convert.convertToMovieResponse(movie);
	}
	
	@Override
	public Single<List<MovieResponse>> getAllMovie() {
		// TODO Auto-generated method stub
		return Observable.fromIterable(movieRepository.findAll())
				.map(this::invokeMovieBuilder)
				.toList();
	}

	@Override
	public Single<MovieResponse> getMovieResponse(Integer codMovie) {
		// TODO Auto-generated method stub
		return Single.just(movieRepository.findById(codMovie)
				.orElse(null))
				.map(this::invokeMovieBuilder);
	}
	
	
	
}
