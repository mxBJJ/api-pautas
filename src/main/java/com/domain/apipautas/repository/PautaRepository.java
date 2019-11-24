package com.domain.apipautas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domain.apipautas.models.Pauta;

public interface PautaRepository extends JpaRepository<Pauta, Long> {

	
	Pauta findById(long id);
}
