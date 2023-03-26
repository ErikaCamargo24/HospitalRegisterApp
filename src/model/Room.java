package model;

import java.util.ArrayList;

public class Room {
	
	/*La idea es que con la opción de crear habitación se ingresen los siguientes datos:
		1. Número de habitación
		2. Número de piso
		3. Id (el id puede ser el número de habitación en tal caso no sería necesario manejar el atributo id)*/

	private int idRoom;
	private int floorNumber;
	private ArrayList<Patient> patientsList;
	
	
	public Room(int idRoom, int floorNumber) {
		this.idRoom = idRoom;
		this.floorNumber = floorNumber;
	}


	public int getIdRoom() {
		return idRoom;
	}

	public void setIdRoom(int idRoom) {
		this.idRoom = idRoom;
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public ArrayList<Patient> getPatientsList() {
		return patientsList;
	}

	public void setPatientsList(ArrayList<Patient> patientsList) {
		this.patientsList = patientsList;
	}

	
	
	
}
