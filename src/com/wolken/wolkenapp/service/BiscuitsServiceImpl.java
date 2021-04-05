package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.dao.BiscuitsDAO;
import com.wolken.wolkenapp.dto.BiscuitsDTO;

public class BiscuitsServiceImpl implements BiscuitsService { // validations of dao
	
	public BiscuitsDAO biscuitsDAO;
	
	 public BiscuitsServiceImpl(BiscuitsDAO biscuitsDAO) {
		 //auto constructor
		 this.biscuitsDAO = biscuitsDAO;
	 }
		@Override
		public boolean validateAndSave(BiscuitsDTO biscuitsDTO) {
			boolean check=false;
			if(biscuitsDTO!= null) {
				String brand = biscuitsDTO.getBrand();
				if(brand != null && !brand.isEmpty() && !brand.contains(" ")) {
					check = true;
					System.out.println("brand is valid");
				}
				else {
					System.out.println("brand is valid");
				}
				
				if(check) {
					int quantity = biscuitsDTO.getQuantity();
					if(quantity >0) {
						System.out.println("quantity is valid");
						check = true;
					}
					else {
						System.out.println("quantity is not valid");
						check=false;
					}
				}
				if(check) {
					double price = biscuitsDTO.getPrice();
					if(price > 0 && price <=100) {
						check = true;
						System.out.println("price is valid ");
					}
					else {
						System.out.println("price is not valid");
						check = false;
					}
				}
				biscuitsDAO.save(biscuitsDTO);
			}
			return check;
     }
}
