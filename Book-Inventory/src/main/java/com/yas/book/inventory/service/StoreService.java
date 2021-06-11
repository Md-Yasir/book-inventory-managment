package com.yas.book.inventory.service;

import java.util.List;

import com.yas.book.inventory.entity.StoreT;

public interface StoreService {

	StoreT addStore(StoreT storeT);

	List<StoreT> getUserStores(Integer userId);

//	Optional<StoreT> getStoreById(Integer storeId);

//	List<StoreT> getAllStores();

}
