package com.distribuida.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.distribuida.entities.Cliente;



@Repository
public class ClienteDAOImpl implements ClienteDAO {

	
	
	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void up(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub

	}

}
