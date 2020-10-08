package com.pe.web.movie.app.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
@Table(name="tbl_movie")
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codMovie;
	
	private String distributionTitle;
	
	private String originTitle;
	
	private LocalDateTime creationDate;
	
	private Integer enabled;
	
	private LocalDateTime releaseDate;
	
	private Boolean typeProject;
	
	private String gender;
	
	private String originCountry;
	
	private String sinopsis;
	
	private Integer duration;
	
	@ManyToOne
	@JoinColumn(name="cod_type_censorship",referencedColumnName="cod_type_censorship")
	private TypeCensorship typeCensorship;
	
	private Boolean statusProject;
	
	private Integer collectionMoney;
	
}
