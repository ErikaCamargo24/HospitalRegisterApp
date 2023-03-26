package model;


public class Patient {
	/*Con la opción de crear paciente se deben ingresar los siguientes datos:
		1. Número o ID de habitación 
		2. Nombre del paciente 
		3. Apellido del paciente
		4. Número de contacto o número del familiar responsable del paciente 

		El nuevo paciente ingresado se debe asociar o ingresar a la lista de pacientes de la habitación indicada */
	private int idRoom;
	private String name;
	private String lastName;
	private String phoneNumber;
	

	public Patient(int idRoom, String name, String lastName, String phoneNumber) {
		super();
		this.idRoom = idRoom;
		this.name = name;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}

	public int getIdRoom() {
		return idRoom;
	}

	public void setIdRoom(int idRoom) {
		this.idRoom = idRoom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
}
