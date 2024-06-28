package com.receptionistservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.receptionistservice.entity.Receptionist;
import com.receptionistservice.repository.ReceptionistRepository;

@Service
public class ReceptionistServiceImpl implements ReceptionistService {

	@Autowired
	private ReceptionistRepository receptionistRepository;
	
	
	@Override
	public List<Receptionist> getAllReceptionists() {
		// TODO Auto-generated method stub
		return receptionistRepository.findAll();
	}

	@Override
	public Receptionist addReceptionist(Receptionist receptionist) {
		// TODO Auto-generated method stub
		
		Receptionist receptionist1 = receptionistRepository.save(receptionist);
		return receptionist1;
	}

}
