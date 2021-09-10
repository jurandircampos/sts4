package com.folhetonet.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.folhetonet.dsvendas.dto.SellerDTO;
import com.folhetonet.dsvendas.entities.Seller;
import com.folhetonet.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	@Autowired
	private SellerRepository repository;
	
	//public List<Seller> findAll(){
	//	return repository.findAll();
	//}
	
	public List<SellerDTO> findAll(){
		List<Seller> result = repository.findAll();
		//transformar o tipo de list (map) expressão lambda(x ->)
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
	
}
 