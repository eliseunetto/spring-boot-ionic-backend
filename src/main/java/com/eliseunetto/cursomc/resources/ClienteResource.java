package com.eliseunetto.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eliseunetto.cursomc.domain.Cliente;
import com.eliseunetto.cursomc.services.ClienteService;

@Controller
@RequestMapping(value = "/clientes")
public class ClienteResource {

	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable Integer id) {
		Cliente obj = clienteService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
