package com.users.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.users.dao.UserDao;
import com.users.domain.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;

	@Override
	public List<User> listar() {
		List<User> listaFinal = new ArrayList<>();
		for (User user : userDao.findAll()) {
			if (user.isStatus() == true) {
				listaFinal.add(user);
			}
		}
		return listaFinal;
	}

	@Override
	public void guardar(User user) {
		user.setStatus(true);
		userDao.save(user);
	}

	@Override
	public void editar(User user) {
		userDao.save(user);
	}

	@Override
	public void eliminar(User user) {
		User userTemporal = userDao.findById(user.getId()).orElse(null);
		if(userTemporal != null) {
			userTemporal.setStatus(false);
			userDao.save(userTemporal);
		}		
	}

	@Override
	public User buscar(User user) {
		return userDao.findById(user.getId()).orElse(null);
	}
}
