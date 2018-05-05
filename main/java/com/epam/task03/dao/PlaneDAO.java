package com.epam.task03.dao;

import java.util.List;

import com.epam.task03.entity.airline.Airline;
import com.epam.task03.entity.plane.Plane;

public interface PlaneDAO {
	
	public List<Plane> getAll();

}
