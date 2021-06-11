package com.yas.book.inventory.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.yas.book.inventory.entity.InventoryT;


@Repository
public interface InventoryRepo extends CrudRepository<InventoryT, Integer>{

	@Query("SELECT i FROM InventoryT i WHERE i.storeId= :storeId")
	List<InventoryT> findByStore(@Param("storeId") Integer storeId);
	
}
