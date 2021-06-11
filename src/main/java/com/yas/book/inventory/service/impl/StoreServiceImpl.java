package com.yas.book.inventory.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yas.book.inventory.entity.StoreT;
import com.yas.book.inventory.repo.StoreRepo;
import com.yas.book.inventory.service.StoreService;

@Service
public class StoreServiceImpl implements StoreService{

	@Autowired
	private StoreRepo storerepo;

	@Override
	public StoreT addStore(StoreT storeT) {

		return storerepo.save(storeT);	
	}
	
	@Override
	public List<StoreT> getUserStores(Integer userId) {

		return storerepo.findByIdUserId(userId);
	}

//	@Override
//	public Optional<StoreT> getStoreById(Integer storeId) {
//		
//		return storerepo.findById(storeId);
//	}

//	@Override
//	public List<StoreT> getAllStores() {
//		
//		return (List<StoreT>) storerepo.findAll();
//	}
//	

}
