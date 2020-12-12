package com.soli.Soli.repositories;

import com.soli.Soli.models.Crop;
import com.soli.Soli.models.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CropRepository extends JpaRepository<Crop, String> {

}
