package com.soli.Soli.repositories;

import com.soli.Soli.models.Member;
import com.soli.Soli.models.Planting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantingRepository extends JpaRepository<Planting, String> {

}
