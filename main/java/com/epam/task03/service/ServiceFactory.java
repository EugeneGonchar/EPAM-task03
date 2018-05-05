package com.epam.task03.service;

import com.epam.task03.service.impl.AirlineServiceImpl;

public class ServiceFactory {
	public static ServiceFactory instance = new ServiceFactory();
	public AirlineService airlineService = new AirlineServiceImpl();
	
	private ServiceFactory(){
		
	}
	
	public AirlineService getAirlineService() {
		return airlineService;
	}
	
	public static ServiceFactory getInstance() {
		return instance;
	}
}
