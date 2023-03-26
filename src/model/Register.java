package model;

import java.util.ArrayList;

public class Register {
	
	
	private ArrayList<Room>roomsList;

	
	public boolean addRoom (int idRoom, int floorNumber) {
        Room newRoom = new Room(idRoom,floorNumber);
        boolean created = false;
        if (comprobateRoom(idRoom) == null) {
            this.roomsList.add(newRoom);
            created = true;
        }
        return created;
    }
	
	
	public Room comprobateRoom(int idRoom) {
		Room aux = null;
		for (int i = 0; i < this.roomsList.size(); i++) {
			if ( this.roomsList.get(i).getIdRoom() == idRoom){
				aux = this.roomsList.get(i);
				}
			}
		return aux;
	}
	 
	 
	
	public boolean addPatient(int idRoom, String name, String lastName, String phoneNumber) {
		 Room roomAux = comprobateRoom(idRoom);
		 Patient newPatient = new Patient(idRoom, name, lastName, phoneNumber);
		 boolean created = false;
		 int positionRoom = -1;
		 if (roomAux == null) {
			 positionRoom = this.roomsList.indexOf(roomAux);
			 //this.roomsList.get(positionRoom).addPatient(newPatient);
			 this.roomsList.get(positionRoom).equals(newPatient);
			 created = true;
			 }
		 return created;
	}
	
}
