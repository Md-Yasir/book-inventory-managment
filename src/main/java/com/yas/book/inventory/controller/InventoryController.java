package com.yas.book.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yas.book.inventory.entity.InventoryT;
import com.yas.book.inventory.service.InventoryService;

@RestController("/inventory")
public class InventoryController {

	@Autowired 
	private InventoryService inventoryservice;

	@RequestMapping(value = "/addInventory", method = RequestMethod.POST)  
	@ResponseBody                                                 
	public InventoryT addInventory(@RequestBody InventoryT inventoryT) {              

		return inventoryservice.addInventory(inventoryT);

	}
	
	@RequestMapping(value = "/updateInventory", method = RequestMethod.POST)  
	@ResponseBody                                                 
	public InventoryT updateInventory(@RequestBody InventoryT inventoryT) {              

		return inventoryservice.updateInventory(inventoryT);

	}

//	@RequestMapping(value = "/getInventory", method = RequestMethod.GET)
//	@ResponseBody
//	public Optional<InventoryT> getInventory(@RequestParam("storeId") Integer storeId) {
//
//		return inventoryservice.getInventory(storeId);
//	}
	
	@RequestMapping(value = "/getStoreBooks", method = RequestMethod.GET)
	@ResponseBody
	public List<InventoryT> getStoreBooks(@RequestParam("storeId") Integer storeId) {

		return inventoryservice.getStoreBooks(storeId);
	}

}
