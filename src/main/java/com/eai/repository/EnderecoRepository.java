package com.eai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eai.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
	
	Endereco findById(long id);

}
