package com.pe.web.movie.app.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieDetail {
	
	private String typeProject;
	
	private String statusProject;
	
	private String typeCensorship;

}
