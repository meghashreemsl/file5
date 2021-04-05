package com.wolken.wolkenapp.dao;

import com.wolken.wolkenapp.dto.BiscuitsDTO;

public interface  BiscuitsDAO { //logic in dao
	
	public void save(BiscuitsDTO biscuitsDTO); 
	
	public void updatePriceByBrandandName(int price, String brand,String name );
	
	public void updateBrandandQuantityByPrice(String name , int quantity, int price);
	
	public void updateNameByBrand(String brand, String name);	
	
	public void deleteByName(String name);
	
	public void deleteAll();
	
	public void getAll();

}
