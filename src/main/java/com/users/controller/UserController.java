package com.users.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.users.domain.User;
import com.users.service.UserService;

@RestController
@RequestMapping("api/User")
@CrossOrigin
public class UserController {

	@Autowired
	UserService userService;

	// http://localhost:9091/api/User/listar
	@GetMapping("listar")
	public List<User> listar() {
		return userService.listar();
	}

	// http://localhost:9091/api/User/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody User user) {
		userService.guardar(user);
	}

	// http://localhost:9091/api/User/editar
	@PostMapping("editar")
	public void editar(@RequestBody User user) {
		userService.guardar(user);
	}

	// http://localhost:9091/api/User/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody User user) {
		userService.eliminar(user);
	}

	// http://localhost:9091/api/User/buscar
	@PostMapping("buscar")
	public User buscar(@RequestBody User user) {
		return userService.buscar(user);
	}
}
