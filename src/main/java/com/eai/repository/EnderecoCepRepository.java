package com.eai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.eai.model.Endereco;

public interface EnderecoCepRepository extends JpaRepository<Endereco, String>{

	@Query("Select c from Endereco c where c.cep =: cep")
	public List<Endereco> find(@Param("cep") String cep);
}
