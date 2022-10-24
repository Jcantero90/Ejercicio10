package com.bosonit.persona.infrastructure.controller.repository;

import com.bosonit.persona.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {
}
