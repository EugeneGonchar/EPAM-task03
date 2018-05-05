package com.epam.task03.entity.plane;

public class Airliner extends CargoPlane{
	private int seatingCapacity;
	
	public Airliner() {
		
	}

	public Airliner(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public int hashCode() {
		int result = 15;
		
		result = 37 * result + (getName() == null ? 0 : getName().hashCode());
		result = 37 * result + getRange();
		result = 37 * result + getFuelConsumption();
		result = 37 * result + getCargoCapacity();
		result = 37 * result + getSeatingCapacity();
		
		return result;
	}
	
	public boolean equals(Object object) {
		if(this == object)
			return true;
		if(object == null)
			return false;
		if(this.getClass() != object.getClass())
			return false;
		
		Airliner airliner = (Airliner)object;
		
		if(this.getName().equals(airliner.getName()))
			return false;
		if(this.getRange() != airliner.getRange())
			return false;
		if(this.getFuelConsumption() != airliner.getFuelConsumption())
			return false;
		if(this.getCargoCapacity() != airliner.getCargoCapacity())
			return false;
		if(this.getSeatingCapacity() != airliner.getSeatingCapacity())
			return false;
		return true;
	}
	
	@java.lang.Override
	public java.lang.String toString() {
		return "Airliner{" +
				"name='" + getName() + '\'' +
				", range=" + getRange() +
				", fuelConsumption=" + getFuelConsumption() +
				", cargoCapacity=" + getCargoCapacity() +
				", seatingCapacity=" + seatingCapacity +
				'}';
	}
}
