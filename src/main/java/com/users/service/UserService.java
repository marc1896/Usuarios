package com.users.service;

import java.util.List;

import com.users.domain.User;

public interface UserService {

	public List<User> listar();
	
	public void guardar(User user);
	
	public void editar(User user);
	
	public void eliminar(User user);
	
	public User buscar(User user);
}
