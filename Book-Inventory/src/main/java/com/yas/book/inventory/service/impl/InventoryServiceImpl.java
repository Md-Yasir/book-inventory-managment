package com.yas.book.inventory.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yas.book.inventory.entity.InventoryT;
import com.yas.book.inventory.repo.InventoryRepo;
import com.yas.book.inventory.service.InventoryService;

@Service
public class InventoryServiceImpl implements InventoryService{

	@Autowired 
	private InventoryRepo inventoryrepo;
	
	@Override
	public InventoryT addInventory(InventoryT inventoryT) {
		
		return inventoryrepo.save(inventoryT);
	}

	@Override
	public Optional<InventoryT> getInventory(Integer storeId) {
		
		return inventoryrepo.findById(storeId);
	}

	@Override
	public InventoryT updateInventory(InventoryT inventoryT) {
		
		return inventoryrepo.save(inventoryT);
	}

	@Override
	public List<InventoryT> getStoreBooks(Integer storeId) {
		
		return inventoryrepo.findByStore(storeId);
	}

}
