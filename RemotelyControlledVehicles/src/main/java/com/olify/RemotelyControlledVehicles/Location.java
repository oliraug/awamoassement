/**
 * 
 */
package com.olify.RemotelyControlledVehicles;

/**
 * @author Olify
 *
 */
public class Location {

	/**
	 * @param direction 
	 * @param point 
	 * 
	 */
	private Point point;
	private Direction direction;
	
	public Location() {
		super();
	}
	public Location(Point point, Direction direction) {
		this.point = point;
		this.direction = direction;
	}
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	public boolean forward() {
		return true;
				
	}
	public Location copyWithLocation() {
		return new Location(this.point, this.direction);
		
	}
	public boolean backward() {
		return true;
	}
	public boolean left() {
		return true;
	}
	public boolean right() {
		return true;
	}
}
