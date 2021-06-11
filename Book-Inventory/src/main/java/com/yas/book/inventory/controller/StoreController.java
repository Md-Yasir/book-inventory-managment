package com.yas.book.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yas.book.inventory.entity.StoreT;
import com.yas.book.inventory.service.StoreService;

@RestController("/store")
public class StoreController {
	
	@Autowired 
	private StoreService storeservice;                       
	                                                              
	@RequestMapping(value = "/addStore", method = RequestMethod.POST)  
	@ResponseBody                                                 
	public StoreT addStore(@RequestBody StoreT storeT) {              
		                                                          
		return storeservice.addStore(storeT);
		
	}
	
	@RequestMapping(value = "/getUserStores", method = RequestMethod.GET)
	@ResponseBody
	public List<StoreT> getUserStores(@RequestParam("userId") Integer userId) {
		
		return storeservice.getUserStores(userId);
	}
	
//	@RequestMapping(value = "/getStoreById", method = RequestMethod.GET)
//	@ResponseBody
//	public Optional<StoreT> getStoreById(@RequestParam("storeId") Integer storeId) {
//		
//		return storeservice.getStoreById(storeId);
//	}
//	
//	@RequestMapping(value = "/getAllStores", method = RequestMethod.GET)
//	@ResponseBody
//	public List<StoreT> getAllStores() {
//		
//		return storeservice.getAllStores();
//	}

	
}
