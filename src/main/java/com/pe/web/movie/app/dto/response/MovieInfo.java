package com.pe.web.movie.app.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MovieInfo {
	
	private String gender;
	
	private String releaseDate;
	
	private Integer duration;

}
