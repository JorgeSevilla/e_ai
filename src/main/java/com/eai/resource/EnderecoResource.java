package com.eai.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eai.model.Endereco;
import com.eai.repository.EnderecoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "Cadastro de Endereços")
@CrossOrigin(origins = "*") //Caso seja necessário fazer petição de um path específico modificar
public class EnderecoResource {

	@Autowired
	EnderecoRepository enderecoRepository;
	
	@GetMapping("/enderecos")
	@ApiOperation(value = "Retorna uma lista de endereços")
	public List<Endereco> listaEnderecos(){
		return enderecoRepository.findAll();
	}
	
	@GetMapping("/endeceros/{id}")
	@ApiOperation("Retorna um só endereço")
	public Endereco listarEndereoUnico(@PathVariable(value = "id") long id) {
		return enderecoRepository.findById(id);
	}
	
	@PostMapping("/endereco")
	@ApiOperation(value = "Salva um Endereço")
	public Endereco salvaEndereco(@RequestBody Endereco endereco) {
		return enderecoRepository.save(endereco);
	}
	
	@DeleteMapping("/endereco")
	@ApiOperation(value = "Deleta um endereço")
	public void deletaEndereco(@RequestBody Endereco endereco) {
		enderecoRepository.delete(endereco);
	}
	
	@PutMapping("/endereco")
	@ApiOperation(value = "Atualiza um endereço")
	public Endereco atualizaEndereco(@RequestBody @Validated Endereco endereco) {
		return enderecoRepository.save(endereco);
	}
}
