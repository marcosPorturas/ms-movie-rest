package com.pe.web.movie.app.service;

import java.util.List;

import com.pe.web.movie.app.dto.response.MovieResponse;

import io.reactivex.Single;

public interface MovieService {
	
	Single<List<MovieResponse>> getAllMovie();
	
	Single<MovieResponse> getMovieResponse(Integer codMovie);
}
