package com.wolken.wolkenapp.dao;

import java.util.List;

import com.wolken.wolkenapp.dto.BiscuitsDTO;

public class BiscuitsDAOImpl implements BiscuitsDAO {
// implementation for interface

	List<BiscuitsDTO> biscuitsDTOs;

	public BiscuitsDAOImpl(List<BiscuitsDTO> biscuitsDTOs) { // CONSTRUCTOR
		this.biscuitsDTOs = biscuitsDTOs;
	}

	public BiscuitsDAOImpl() {
		// TODO Auto-generated constructor stub

	}

	@Override
	public void save(BiscuitsDTO biscuitsDTO) {
		boolean check = this.biscuitsDTOs.contains(biscuitsDTO);
		// boolean check= false;
		if (!check) {
			biscuitsDTOs.add(biscuitsDTO);
			System.out.println("biscuits added");
		} else {
			System.out.println("biscuits not  added");
		}

	}

	@Override
	public void updatePriceByBrandandName(int price, String brand, String name) {
		// TODO Auto-generated method stub
		int check = 0;
		for (BiscuitsDTO biscuitsDTO : biscuitsDTOs) {
			if (biscuitsDTO.getBrand().equalsIgnoreCase(brand) && biscuitsDTO.getName().equalsIgnoreCase(name)) {
				biscuitsDTO.setPrice(price);
				check = 1;
			}
		}
		if (check == 0) {
			System.out.println("not found");
		}
	}

	@Override
	public void updateBrandandQuantityByPrice(String brand, int quantity, int price) {
		// TODO Auto-generated method stub
		int check = 0;
		for (BiscuitsDTO biscuitsDTO : biscuitsDTOs) {
			if (biscuitsDTO.getPrice() == price) {
				biscuitsDTO.setQuantity(quantity);
				biscuitsDTO.setBrand(brand);
				check = 1;
			}
		}
		if (check == 0) {
			System.out.println("not found");
		}
	}

	@Override
	public void updateNameByBrand(String brand, String name) {
		// TODO Auto-generated method stub
		int check = 0;
		for (BiscuitsDTO biscuitsDTO : biscuitsDTOs) {
			if (biscuitsDTO.getBrand().equalsIgnoreCase(brand)) {
				biscuitsDTO.setName(name);
				check = 1;
			}
		}
		if (check == 0) {
			System.out.println("not found");
		}
	}

	@Override
	public void deleteByName(String name) {
		// TODO Auto-generated method stub
		int check = 0;
		for (BiscuitsDTO biscuitsDTO : biscuitsDTOs) {
			if (biscuitsDTO.getName().equalsIgnoreCase(name)) {
				this.biscuitsDTOs = null;
				check = 1;
			}
		}
		if (check == 0) {
			System.out.println("not found");
		}
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		for (BiscuitsDTO biscuitsDTO : biscuitsDTOs) {

			System.out.println(biscuitsDTO.getBrand() + " " + biscuitsDTO.getId() + " " + biscuitsDTO.getName() + " "
					+ biscuitsDTO.getQuantity());

		}
	}
}
