package com.folhetonet.dsvendas.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.folhetonet.dsvendas.dto.SellerDTO;
import com.folhetonet.dsvendas.entities.Sale;
import com.folhetonet.dsvendas.entities.Seller;
import com.folhetonet.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	@Autowired
	private SellerRepository repository;
	
	public Page<SellerDTO> findAll(Pageable pageable){
		
		Page<Seller> result = repository.findAll(pageable);
		//transformar o tipo de list (map) expressão lambda(x ->)
		return result.map(x -> new SellerDTO(x));
	}
}
 