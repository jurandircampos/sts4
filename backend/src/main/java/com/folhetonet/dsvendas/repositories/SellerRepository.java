package com.folhetonet.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.folhetonet.dsvendas.entities.Seller;

//Todas as implementações de Incluir/Excluir/Atualizar/Pesquisar
//São executadas pelo FRAMEWORK JPA
public interface SellerRepository extends JpaRepository<Seller, Long> {

}
