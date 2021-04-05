package com.wolken.wolkenapp;

import java.util.Comparator;

import com.wolken.wolkenapp.dto.BiscuitsDTO;

public class BrandComparator implements Comparator<BiscuitsDTO> {

	
	@Override
	public int compare(BiscuitsDTO o1, BiscuitsDTO o2) {
		// TODO Auto-generated method stub
		return o1.getBrand().compareTo(o2.getBrand());
	}

	
}
