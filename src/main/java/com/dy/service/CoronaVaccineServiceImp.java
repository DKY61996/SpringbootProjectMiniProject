package com.dy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dy.entity.CornonaVaccine;
import com.dy.repo.CoronaVaccineRepo;

@Service("CoronaVaccineServiceImp")
public class CoronaVaccineServiceImp implements ICoronaVaccineService {
    
	@Autowired
	private CoronaVaccineRepo Coronarepo;

	/*
	 * @Autowired private CornonaVaccine vacc;
	 */
	
	@Override
	public String registerVaccine(CornonaVaccine vaccine) {
		
		CornonaVaccine savedvaccine = null;
		if(vaccine !=null) {
			savedvaccine= Coronarepo.save(vaccine);
		}
		
		return savedvaccine!=null?"Vaccine is successfully inserted/updated" + savedvaccine.getRegNo(): "Vaccine Registration Failed";
	}
	@Override
	public Iterable<CornonaVaccine> registerInBatch(Iterable<CornonaVaccine> vaccines) {
		// TODO Auto-generated method stub
		if(vaccines != null) 
		return	Coronarepo.saveAll(vaccines);
		
		else 
			throw new IllegalArgumentException("Batch not inserted");
		
		
		
		
		
	}
	@Override
	public long VaccineCount() {
		// TODO Auto-generated method stub
		return Coronarepo.count();
	}
	@Override
	public Iterable<CornonaVaccine> fetchAllDetails() {
		return Coronarepo.findAll();
	}
	@Override
	public Iterable<CornonaVaccine> fetchAllById(List<Long> ids) {
		
		return Coronarepo.findAllById(ids);
	}

}
