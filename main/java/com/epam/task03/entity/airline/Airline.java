package com.epam.task03.entity.airline;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.epam.task03.entity.plane.Plane;

public class Airline {
	private String name;
	private List<Plane> planes = new ArrayList<Plane>();

	public Airline() {
		
	}
	
	public void addPlane(Plane plane) {
		planes.add(plane);
	}
	
	public Airline(String name) {
		this.name = name;
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Plane> getPlanes() {
		return planes;
	}

	public void setPlanes(List<Plane> planes) {
		this.planes = planes;
	}
}
