package com.blackCode.cadastro.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="produto")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String marca;
	private String motor;
	private String ano;
	
	public void obterProdutoEntity(Long id, String marca, String motor, String ano) {
		//System.out.println(this.id, this.marca, this.motor, this.ano);
	}
}
