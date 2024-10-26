package com.Unison.unison.Service;

import com.Unison.unison.Entity.boltEntity;
import com.Unison.unison.Entity.lastEntity;
import com.Unison.unison.Entity.refEntity;
import com.Unison.unison.Repository.BoltRepository;
import com.Unison.unison.Repository.LastRepository;
import com.Unison.unison.Repository.RefRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BoltService {

    private final BoltRepository boltRepository;
    private final LastRepository lastRepository;
    private final RefRepository refRepository;

    @Autowired
    public BoltService(BoltRepository boltRepository, LastRepository lastRepository, RefRepository refRepository){
        this.boltRepository = boltRepository;
        this.lastRepository = lastRepository;
        this.refRepository = refRepository;
    }

    public List<boltEntity> getBoltByNumber(int number, int floor){
        return boltRepository.findByNumberAndFloor(number, floor);
    }

    public List<lastEntity> getLastByNumber(int floor){
        return lastRepository.findByFloor(floor);
    }

    public List<refEntity> getRefByNumber(int floor){
        return refRepository.findByFloor(floor);
    }
}
