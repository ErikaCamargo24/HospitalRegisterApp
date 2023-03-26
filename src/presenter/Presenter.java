package presenter;

import model.*;
import view.View;

public class Presenter {
	
	private View view;
	private Register register;
	// private ResourceBundle resourceBundle;

	private static final String ADD_ROOM = "1";
	private static final String ADD_PATIENT = "2";
	private static final String KEEP_XML = "3";
	private static final String EXIT = "4";
	

	public Presenter() {
		view = new View();
		register = new Register();

	}

	public void run() {
		this.showMenu();
	}

	public void showMenu() {
		view.printMenu();
		String option = view.getMenuOption();
		switch (option) {
			case ADD_ROOM:
				this.addRoom();
				break;
			case ADD_PATIENT:
				this.addPatient();
				break;
			case KEEP_XML:
				this.keepXml();
				break;
			case EXIT:
				view.showExitMessage();
				return;

			default:
				break;
		}
		showMenu();
	}

	private void addRoom() {
		// TODO Auto-generated method stub
		
	}

	private void addPatient() {
		// TODO Auto-generated method stub
		
	}

	private void keepXml() {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) {
		Presenter presenter = new Presenter();
		presenter.run();
	}

}
