package view;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class View {
	
	public static final String MAIN_MENU = "REGISTRAR HABITACIONES Y PACIENTES \n ";
    public static final String ADD_ROOM = "1. Crear habitación \n";
    public static final String ADD_PATIENT  = "2. Crear paciente \n";
    public static final String KEEP_XML = "3. Guardar XML \n ";
    public static final String EXIT = "4. Salir \n";
    private static final String GET_MENU_OPTION_MESSAGE = "Digite opcion: ";
    

    private Scanner console;

    public View() {
        console = new Scanner(System.in);
    }

    public String getMenuOption() {
        return JOptionPane.showInputDialog(GET_MENU_OPTION_MESSAGE);
    }

    public void printMenu() {
        JOptionPane.showInputDialog(
                MAIN_MENU + ADD_ROOM + ADD_PATIENT + KEEP_XML + EXIT);
    }

	public void showExitMessage() {
		JOptionPane.showInputDialog(EXIT);
	}

}
