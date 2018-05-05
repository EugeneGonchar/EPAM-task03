package com.epam.task03.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.epam.task03.dao.DAOFactory;
import com.epam.task03.dao.PlaneDAO;
import com.epam.task03.entity.airline.Airline;
import com.epam.task03.entity.plane.Airliner;
import com.epam.task03.entity.plane.CargoPlane;
import com.epam.task03.entity.plane.Plane;
import com.epam.task03.service.AirlineService;
import com.epam.task03.utils.comparator.PlaneRangeComparator;

public class AirlineServiceImpl implements AirlineService{
	public List<Plane> getAll(){
		DAOFactory factory = DAOFactory.getInstance();
		PlaneDAO planeDAO = factory.getPlaneDAO();
		
		List<Plane> planeList = planeDAO.getAll();
		
		return planeList;
	}
	
	public List<Plane> sort(List<Plane> planes, Comparator<Plane> c){
		Collections.sort(planes, c);	
		return planes;
	}
	
	public List<Plane> findFuelCapacity(List<Plane> planes, int min, int max){
		Iterator iterator = planes.iterator();
		List<Plane> bufPlanes = new ArrayList<Plane>();
		while(iterator.hasNext()) {
			Plane plane = (Plane) iterator.next();
			int fuelConsumption = plane.getFuelConsumption();
			if(fuelConsumption >= min & fuelConsumption <= max)
				bufPlanes.add(plane);
		}
		return bufPlanes;
	}
	
	public int sumSeatingCapacity(Airline airline){
		Iterator iterator = airline.getPlanes().iterator();
		int seatingSum = 0;
		while(iterator.hasNext()) {
			Plane plane = (Plane) iterator.next();
			if(plane instanceof Airliner)
				seatingSum += ((Airliner) plane).getSeatingCapacity();
		}
		return seatingSum;
	}
	
	public int sumCargoCapacity(Airline airline){
		Iterator iterator = airline.getPlanes().iterator();
		int cargoSum = 0;
		while(iterator.hasNext()) {
			Plane plane = (Plane) iterator.next();
			if(plane instanceof CargoPlane)
				cargoSum += ((CargoPlane) plane).getCargoCapacity();
		}
		return cargoSum;
	}
}
