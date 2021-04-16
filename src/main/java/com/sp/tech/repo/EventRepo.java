package com.sp.tech.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sp.tech.model.Event;

@Repository
public interface EventRepo extends JpaRepository<Event, Integer> {

}
