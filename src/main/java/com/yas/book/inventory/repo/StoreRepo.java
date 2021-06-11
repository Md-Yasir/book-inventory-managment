package com.yas.book.inventory.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.yas.book.inventory.entity.StoreT;

@Repository
public interface StoreRepo extends CrudRepository<StoreT, Integer> {

	@Query("SELECT s FROM StoreT s WHERE s.userId= :userId")
	List<StoreT> findByIdUserId(@Param("userId") Integer userId);

}
