package com.itszaif.wheelofnames.repository;

import com.itszaif.wheelofnames.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Long, User> {

}
