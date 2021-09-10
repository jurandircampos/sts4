package com.folhetonet.dsvendas.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sellers")
public class Seller {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Incrementar automático id no banco
	private Long id;
	private String name;
	
	//List uma interface não pode instanciar uma interface
	//ArrayList classe
	//Coleção colocar /getter so o get para receber
	
	@OneToMany(mappedBy = "seller")
	private List<Sale> sales = new ArrayList<>();
	
	//Criar construtor padrão
	public Seller() {
		
	}

	//Criar usando botão direito --> Source--> Generate Constructor Using Fields
	public Seller(Long id, String name) {
		//--não precisa super();
		this.id = id;
		this.name = name;
	}
	//Generate Getters and Setters
	//Clicar botão direito --> Source--> Generate Getters and Setters

	//Encapsulamento
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Sale> getSales() {
		return sales;
	}
	
	
}
