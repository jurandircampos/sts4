package com.folhetonet.dsvendas.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//Mapeamento Objeto relacional / (H2/Postgres/Mysql) 
@Entity
@Table(name = "tb_sales")
public class Sale {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Incrementar automático id no banco
	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date; //Importar CTRL+SHIFT+O
	
	@ManyToOne
	@JoinColumn(name="seller_id")  //CTRL+ Espaço completa
	private Seller seller;
	
	//Criar o construtor padrão
	public Sale() {
	}
	
	//Gerar o Construtor usando --Source--> Generate Constructor using Fields
	public Sale(Long id, Integer visited, Integer deals, Double amount, LocalDate date, Seller seller) {
		//super(); Não tem herança.. não precisa
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}

	//Source --> Generate Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	
}
