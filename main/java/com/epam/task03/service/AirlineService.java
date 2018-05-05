package com.epam.task03.service;

import java.util.Comparator;
import java.util.List;

import com.epam.task03.entity.airline.Airline;
import com.epam.task03.entity.plane.Plane;

public interface AirlineService {
	public List<Plane> getAll();
	
	public List<Plane> sort(List<Plane> planes, Comparator<Plane> c);
	
	public List<Plane> findFuelCapacity(List<Plane> planes, int min, int max);
	
	public int sumSeatingCapacity(Airline airline);
	
	public int sumCargoCapacity(Airline airline);
}
