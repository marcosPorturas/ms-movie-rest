package com.pe.web.movie.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Entity
@Table(name="tbl_type_censorship")
public class TypeCensorship {
	
	@Id
	@Column(name="cod_type_censorship")
	private Integer codTypeCensorship;
	
	private String description;

}
