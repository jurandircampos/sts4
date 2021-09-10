package com.folhetonet.dsvendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.folhetonet.dsvendas.dto.SaleDTO;
import com.folhetonet.dsvendas.entities.Sale;
import com.folhetonet.dsvendas.repositories.SaleRepository;
import com.folhetonet.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		//transformar o tipo de list (map) expressão lambda(x ->)
		return result.map(x -> new SaleDTO(x));
	}
	
}
 