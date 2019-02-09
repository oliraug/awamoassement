/**
 * 
 */
package com.olify.RemotelyControlledVehicles;

/**
 * @author Olify
 *
 */
public class Ship {

	/**
	 * 
	 */
	private char command;
	private Location location;
	public Ship() {
		super();
	}

	public Ship(Location location) {
		this.location = location;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public void moveForward() {
		location.forward();				
	}

	public void moveBackward() {
		location.backward();		
	}

	public void turnLeft() {
		location.left();
	}
	
	public void turnRight() {
		location.right();
	}

	public void receiveCommands(String commands) {
		for (char command : commands.toCharArray()) {
			switch(command) {
			case 'f':
			moveForward();
			break;
			case 'b':
			moveBackward();
			break;
			case 'l':
			turnLeft();
			break;
			case 'r':
			turnRight();
			break;
		}
	}
	}

	public char getCommand() {
		return command;
	}

	public void setCommand(char command) {
		this.command = command;
	}

}
