package org.alura.spring.repository;

import org.alura.spring.model.Guest;
import org.springframework.data.repository.CrudRepository;

public interface GuestRepository extends CrudRepository<Guest, Long> {
	
}
