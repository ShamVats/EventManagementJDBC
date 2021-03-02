package com.cg.em.dao;

import java.time.LocalDate;
import java.util.List;

import com.cg.em.exception.EventManagementException;
import com.cg.em.model.Events;

public class EventDAOJDBCImpl implements IEventDAO {

	@Override
	public String add(Events event) throws EventManagementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(String eventId) throws EventManagementException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Events get(String eventId) throws EventManagementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Events> getALL() throws EventManagementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Events event) throws EventManagementException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void persist() throws EventManagementException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Events> listAllEvents(String location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Events> listAllEvents(LocalDate datesheduled) {
		// TODO Auto-generated method stub
		return null;
	}

}
