package com.epam.task03.entity.plane;

public abstract class Plane {
	private String name;
	private int range;
	private int fuelConsumption;
	
	public Plane() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", range=" + range +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
