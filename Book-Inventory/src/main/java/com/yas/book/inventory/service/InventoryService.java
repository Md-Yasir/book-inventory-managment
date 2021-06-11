package com.yas.book.inventory.service;

import java.util.List;
import java.util.Optional;

import com.yas.book.inventory.entity.InventoryT;

public interface InventoryService {

	InventoryT addInventory(InventoryT inventoryT);

	Optional<InventoryT> getInventory(Integer storeId);

	InventoryT updateInventory(InventoryT inventoryT);

	List<InventoryT> getStoreBooks(Integer storeId);

}
