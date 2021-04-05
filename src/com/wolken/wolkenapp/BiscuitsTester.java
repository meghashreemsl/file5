package com.wolken.wolkenapp;

import java.util.ArrayList;
import java.util.List;

import com.wolken.wolkenapp.dao.BiscuitsDAO;
import com.wolken.wolkenapp.dao.BiscuitsDAOImpl;
import com.wolken.wolkenapp.dto.BiscuitsDTO;
import com.wolken.wolkenapp.service.BiscuitsService;
import com.wolken.wolkenapp.service.BiscuitsServiceImpl;

public class BiscuitsTester {
	public static void main(String[] args) {
		
		List<BiscuitsDTO> biscuitsDTOs = new ArrayList<BiscuitsDTO>();
		 BiscuitsDAO biscuitsDAO = new BiscuitsDAOImpl(biscuitsDTOs);
		 BiscuitsDTO biscuitsDTO = new BiscuitsDTO();
		 
		 
		 biscuitsDTO.setBrand("parle");
		 biscuitsDTO.setId(7);
		 biscuitsDTO.setPrice(40);
		 biscuitsDTO.setName("HideAndSeek");
		 biscuitsDTO.setQuantity(500);
		 
		 
		 BiscuitsService biscuitsService = new BiscuitsServiceImpl(biscuitsDAO);
		 biscuitsService.validateAndSave(biscuitsDTO) ;
		 
		 biscuitsDAO.updateBrandandQuantityByPrice("Nestle", 44, 99);
		 biscuitsDAO.updatePriceByBrandandName(455, "parle", "chaskamaska");
		 
			/*
			 * BiscuitsDTO biscuitsDTO1 = new BiscuitsDTO();
			 * biscuitsDTO1.setBrand("cadbuary"); biscuitsDTO1.setId(6);
			 * biscuitsDTO1.setPrice(40); biscuitsDTO1.setName("hide and seek");
			 * biscuitsDTO1.setQuantity(800);
			 * 
			 * BiscuitsDTO biscuitsDTO2 = new BiscuitsDTO(); biscuitsDTO2.setBrand("parle");
			 * biscuitsDTO2.setPrice(40); biscuitsDTO2.setId(8);
			 * biscuitsDTO2.setName("chaska maska"); biscuitsDTO2.setQuantity(1000);
			 * 
			 */
		 // another way
		// List<BiscuitsDTO> biscuitsDTOs = new ArrayList<>();
			/*
			 * biscuitsDTOs.add(biscuitsDTO);
			 *  biscuitsDTOs.add(biscuitsDTO1);
			 * biscuitsDTOs.add(biscuitsDTO2);
			 */
		 
		 
		 
			/*
			 * Map<Integer,BiscuitsDTO> biscuitsDTOs1 = new HashMap<Integer,BiscuitsDTO>();
			 * biscuitsDTOs1.put(1,biscuitsDTO); biscuitsDTOs1.put(2,biscuitsDTO1);
			 * biscuitsDTOs1.put(3,biscuitsDTO2);
			 * 
			 * for(Map.Entry<Integer,BiscuitsDTO> ref :biscuitsDTOs1.entrySet()){
			 * System.out.println("---------------------------"); System.out.println(ref);
			 * // System.out.println("---------------------------");
			 * //System.out.println(ref.getKey()+" "+ref.getValue()); }
			 * System.out.println("key set"); System.out.println(biscuitsDTOs1.keySet());
			 */
		   
		   
		   
		/* biscuitsDTOs1.forEach(System.out::println);  // to get all data 
		 System.out.println("--------------------------");
		 Collections.sort(biscuitsDTOs1);
		 System.out.println("--------------------------");
		 Collections.sort(biscuitsDTOs1, new BrandComparator());
		 biscuitsDTOs1.forEach(System.out::println);  
		 
		 BiscuitsDAO biscuitsDAO = new BiscuitsDAOImpl(biscuitsDTOs1);
		 BiscuitsService biscuitsService = new BiscuitsServiceImpl(biscuitsDAO);
		 biscuitsService.validateAndSave(biscuitsDTO);
		 */
		 
	}

}
