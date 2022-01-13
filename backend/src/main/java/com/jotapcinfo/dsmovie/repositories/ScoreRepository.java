package com.jotapcinfo.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jotapcinfo.dsmovie.entities.Score;
import com.jotapcinfo.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
