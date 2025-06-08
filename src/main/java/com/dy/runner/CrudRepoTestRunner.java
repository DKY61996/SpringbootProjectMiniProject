package com.dy.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.dy.entity.CornonaVaccine;
import com.dy.service.ICoronaVaccineService;

@Component
public class CrudRepoTestRunner implements CommandLineRunner {

	@Autowired
	private ICoronaVaccineService service;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		
		/*
		 * try { Iterable<CornonaVaccine> listofVaccine =
		 * service.registerInBatch(Arrays.asList(20L,"sputnik1",
		 * "Russie","Russia",527.8, 2), new CornonaVaccine(1L,"pyzer1",
		 * "pyzer","USA",648.8, 2), new CornonaVaccine(5L,"moderena1",
		 * "moderena","USA",415.8, 2) ); System.out.println("The regNos are ");
		 * 
		 * listofVaccine.forEach(vaccine->System.out.println(vaccine.getRegNo())); }
		 * 
		 * catch(DataAccessException dae) { dae.printStackTrace();
		 * 
		 * 
		 * }
		 */
		try {
			System.out.println("Get the vaccine count" + service.VaccineCount());
		} catch (DataAccessException das) {
			das.printStackTrace();
		}
		
		/*
		 * try { System.out.println("21 regNo vaccine avaiable? ::"+
		 * service.checkVaccineAvailabilityByRegNo(52)); }
		 * 
		 * catch(DataAccessException das) { das.printStackTrace(); }
		 */		
		
		System.out.println("==========Find all Method=============");
		
		Iterable<CornonaVaccine> itlist = service.fetchAllDetails();
		try {
			itlist.forEach(vaccine -> {
				System.out.println(vaccine);
			});
		}
			catch (DataAccessException e) {
			e.printStackTrace();
			}
		
		System.out.println("=========FindByIds=========");
		Iterable<CornonaVaccine> itlist1 = service.fetchAllById(List.of(1L,2L));
	try {
		itlist1.forEach(vaccine -> {
			
		System.out.println(vaccine);
		});
	}
		catch(DataAccessException e) {
			e.printStackTrace();
			}
		
	
		
		
	

	
	

	}

}
