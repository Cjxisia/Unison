package com.Unison.unison.Repository;

import com.Unison.unison.Entity.lastEntity;
import com.Unison.unison.Entity.refEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RefRepository extends JpaRepository<refEntity, Long> {
    List<refEntity> findByFloor(int floor);
}
