package com.domain.apipautas.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.apipautas.models.Pauta;
import com.domain.apipautas.repository.PautaRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="Pautas API REST")
@CrossOrigin(origins="*")
public class PautaResource {
	
	@Autowired
	PautaRepository pautaRepository;
	
	@GetMapping("/pautas")
	@ApiOperation(value="Retorna uma lista de pautas.")
	public List<Pauta> listPautas(){
		
		return pautaRepository.findAll();
	}
	
	
	@GetMapping("/pautas/{id}")
	@ApiOperation(value="Retorna uma pauta.")
	public Pauta listPautasById(@PathVariable(value="id") long id){
		
		return pautaRepository.findById(id);
	}
	
	
	@PostMapping("/pautas")
	@ApiOperation(value="Cria uma pauta.")
	public Pauta savePauta(@RequestBody Pauta pauta) {
		return pautaRepository.save(pauta);
	}
	
	@DeleteMapping("/pautas")
	@ApiOperation(value="Deleta uma pauta.")
	public void deletePauta(@RequestBody Pauta pauta) {
		pautaRepository.delete(pauta);
	}
	
	
	@PutMapping("/pautas")
	@ApiOperation(value="Atualiza uma pauta.")
	public Pauta updatePauta(@RequestBody Pauta pauta) {
		return pautaRepository.save(pauta);
	
	}
	
	

}
