package client.gui;

public interface ClientParameters {
	// Strings
	public static final String WINDOW_TITLE = "Client Application";
	public static final String CONNECT_BUTTON = "Connect";
	public static final String HOST_TEXT_FIELD = "Host Address";
	public static final String PORT_NUMBER_TEXT_FIELD = "Port Number";
	public static final String NO_VALUES = "You must provide valid values in order to connect to the server!";
	public static final String WRONG_PORT = "Port value must be between 1024 and 65535";
	
	//booleans
	public static final boolean IS_RESIZABLE = false;
	
	// integers
	public static final int WINDOW_WIDTH = 480;
	public static final int WINDOW_HEIGHT = 100;
	public static final int MAX_PORT_NUMBER = 65535;
	public static final int MIN_PORT_NUMBER = 1024;
}
