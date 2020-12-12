package com.soli.Soli.repositories;

import com.soli.Soli.models.Species;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeciesRepository extends JpaRepository<Species, String> {

}
