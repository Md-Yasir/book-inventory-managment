package com.yas.book.inventory.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yas.book.inventory.entity.UserT;

@Repository
public interface UserRepo extends CrudRepository<UserT, Integer> {

}
