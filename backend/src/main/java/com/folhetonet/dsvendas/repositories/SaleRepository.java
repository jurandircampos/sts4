package com.folhetonet.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.folhetonet.dsvendas.entities.Sale;

//Todas as implementações de Incluir/Excluir/Atualizar/Pesquisar
//São executadas pelo FRAMEWORK JPA
public interface SaleRepository extends JpaRepository<Sale, Long> {

}
