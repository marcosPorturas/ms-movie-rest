package com.pe.web.movie.app.builder;

import com.pe.web.movie.app.dto.response.MovieDetail;
import com.pe.web.movie.app.dto.response.MovieInfo;
import com.pe.web.movie.app.dto.response.MovieResponse;
import com.pe.web.movie.app.entity.Movie;
import com.pe.web.movie.app.utilitario.Constants;
import com.pe.web.movie.app.utilitario.Util;

public class ConverBuilderMovie {

	public MovieResponse convertToMovieResponse(Movie movie) {
		return MovieResponse.builder()
				.codMovie(movie.getCodMovie())
				.distributionTitle(movie.getDistributionTitle())
				.originTitle(movie.getOriginTitle())
				.originCountry(movie.getOriginCountry())
				.movieInfo(convertToMovieInfo(movie))
				.movieDetail(convertToMovieDetail(movie))
				.sinopsis(movie.getSinopsis())
				.collectionMoney(movie.getCollectionMoney())
				.build();
	}
	
	public MovieInfo convertToMovieInfo(Movie movie) {
		return MovieInfo.builder()
				.gender(movie.getGender())
				.releaseDate(Util.convertToStringDate(movie.getReleaseDate()))
				.duration(movie.getDuration())
				.build();
	}
	
	public MovieDetail convertToMovieDetail(Movie movie) {
		return MovieDetail.builder()
				.typeProject(movie.getTypeProject()?
						Constants.ESTRENO:Constants.FUERA_ESTRENO)
				.statusProject(movie.getStatusProject()?
						Constants.CARTELERA:Constants.FUERA_CARTELERA)
				.typeCensorship(movie.getTypeCensorship().getDescription())
				.build();
	}
}
