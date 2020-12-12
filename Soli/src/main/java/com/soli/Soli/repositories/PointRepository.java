package com.soli.Soli.repositories;

import com.soli.Soli.models.Point;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointRepository  extends JpaRepository<Point, String> {

}
