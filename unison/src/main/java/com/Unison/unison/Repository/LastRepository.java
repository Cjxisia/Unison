package com.Unison.unison.Repository;

import com.Unison.unison.Entity.boltEntity;
import com.Unison.unison.Entity.lastEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LastRepository extends JpaRepository<lastEntity, Long> {
    List<lastEntity> findByFloor(int floor);
}
