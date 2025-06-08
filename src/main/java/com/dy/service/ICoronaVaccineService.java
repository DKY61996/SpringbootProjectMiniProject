package com.dy.service;

import java.util.List;

import com.dy.entity.CornonaVaccine;

public interface ICoronaVaccineService {
	public String registerVaccine(CornonaVaccine vaccine);
	public Iterable<CornonaVaccine> registerInBatch(Iterable<CornonaVaccine> vaccines);//registeration of cornona vaccine in batch chek the service class for the implnenation

	public long VaccineCount();
	public Iterable<CornonaVaccine> fetchAllDetails();
	public Iterable<CornonaVaccine> fetchAllById(List<Long> ids);
}
