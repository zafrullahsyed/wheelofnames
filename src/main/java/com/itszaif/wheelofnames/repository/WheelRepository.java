package com.itszaif.wheelofnames.repository;

import com.itszaif.wheelofnames.entity.Wheel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WheelRepository extends CrudRepository<Long, Wheel> {

}
