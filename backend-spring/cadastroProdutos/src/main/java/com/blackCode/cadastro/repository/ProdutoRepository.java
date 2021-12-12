package com.blackCode.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blackCode.cadastro.entity.ProdutoEntity;;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long>{

}
