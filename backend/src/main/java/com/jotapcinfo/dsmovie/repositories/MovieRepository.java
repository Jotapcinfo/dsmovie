package com.jotapcinfo.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jotapcinfo.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
