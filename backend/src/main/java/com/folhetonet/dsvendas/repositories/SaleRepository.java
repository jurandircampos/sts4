package com.folhetonet.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.folhetonet.dsvendas.dto.SaleSuccessDTO;
import com.folhetonet.dsvendas.dto.SaleSumDTO;
import com.folhetonet.dsvendas.entities.Sale;

//Todas as implementações de Incluir/Excluir/Atualizar/Pesquisar
//São executadas pelo FRAMEWORK JPA
public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query("SELECT new com.folhetonet.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ " FROM Sale AS obj GROUP BY obj.seller") //JPPL
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.folhetonet.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ " FROM Sale AS obj GROUP BY obj.seller") //JPPL
	List<SaleSuccessDTO> successGroupedBySeller();
}
