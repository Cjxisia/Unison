package com.Unison.unison.Repository;

import com.Unison.unison.Entity.boltEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoltRepository extends JpaRepository<boltEntity, Long> {
    List<boltEntity> findByNumberAndFloor(int number, int floor);
}
