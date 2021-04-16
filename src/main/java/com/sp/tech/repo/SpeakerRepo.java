package com.sp.tech.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sp.tech.model.Speaker;

@Repository
public interface SpeakerRepo extends JpaRepository<Speaker,Integer> {

}
