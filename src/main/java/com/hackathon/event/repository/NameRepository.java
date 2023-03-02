package com.hackathon.event.repository;

import com.hackathon.event.model.Name;
import com.hackathon.event.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NameRepository extends JpaRepository<Name, Long> {
}
