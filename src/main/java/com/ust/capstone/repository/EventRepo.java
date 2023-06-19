package com.ust.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.capstone.model.Event;

public interface EventRepo extends JpaRepository<Event,Long> {

}
