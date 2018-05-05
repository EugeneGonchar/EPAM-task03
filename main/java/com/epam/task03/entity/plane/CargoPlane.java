package com.epam.task03.entity.plane;

public class CargoPlane extends CivilPlane{
	private int cargoCapacity;
	
	public CargoPlane() {
		
	}

	public int getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	public int hashCode() {
		int result = 15;
		
		result = 37 * result + (getName() == null ? 0 : getName().hashCode());
		result = 37 * result + getRange();
		result = 37 * result + getFuelConsumption();
		result = 37 * result + getCargoCapacity();
		
		return result;
	}
	
	public boolean equals(Object object) {
		if(this == object)
			return true;
		if(object == null)
			return false;
		if(this.getClass() != object.getClass())
			return false;
		
		CargoPlane cargoPlane = (CargoPlane)object;
		
		if(this.getName().equals(cargoPlane.getName()))
			return false;
		if(this.getRange() != cargoPlane.getRange())
			return false;
		if(this.getFuelConsumption() != cargoPlane.getFuelConsumption())
			return false;
		if(this.getCargoCapacity() != cargoPlane.getCargoCapacity())
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CargoPlane{" +
				"name='" + getName() + '\'' +
				", range=" + getRange() +
				", fuelConsumption=" + getFuelConsumption() +
				", cargoCapacity=" + cargoCapacity +
				'}';
	}
}
