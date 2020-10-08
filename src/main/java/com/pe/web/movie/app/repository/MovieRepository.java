package com.pe.web.movie.app.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pe.web.movie.app.entity.Movie;

@Repository
@Transactional
public interface MovieRepository extends JpaRepository<Movie,Integer>{

}
