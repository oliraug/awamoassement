/**
 * Requirement 1
 * Need to know what the current location of the ship is in order to be able to move it
 */
package com.olify.test.RemotelyControlledVehicles;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.olify.RemotelyControlledVehicles.Direction;
import com.olify.RemotelyControlledVehicles.Location;
import com.olify.RemotelyControlledVehicles.Point;
import com.olify.RemotelyControlledVehicles.Ship;

/**
 * @author Olify
 *
 */
public class ShipSpecificationTest {
	private Ship ship;
	private Location location;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		Location location = new Location(
				new Point(26, 15), Direction.NORTH);
		ship = new Ship(location);
	}

	@Test
	public void test_whenWhenShipLocationIsSet() throws Exception {		
		assertThat(ship.getLocation()).isEqualTo(location);
	}
	/*
	 * The rover receives a character array of commands
	 */
	@Test
	public void test_WhenReceiveArrayOfCommandsThenExecuteAll() throws Exception{
		Location expected = location.copyWithLocation();
		expected.forward();
		expected.backward();
		expected.right();
		expected.left();
		ship.receiveCommands("fbrl");
		assertThat(ship.getLocation()).isEqualTo(expected);
		}
	
	/*
	 * Implementing commands that push the ship forward (f).
	 */
	@Test
	public void test_WhenMoveForwardThenItIsForward() throws Exception{
		ship.getLocation().setDirection(Direction.EAST);
		ship.moveForward();
		assertThat(ship.getLocation().getPoint().getX()).isEqualTo(26);
		assertThat(ship.getLocation().getPoint().getY()).isEqualTo(15);
		}
	
	/*
	 * Implementing commands that turn the ship backward (b).
	 */
	@Test
	public void test_WhenMoveBackwardThenItIsBackward() throws Exception{
		ship.getLocation().setDirection(Direction.WEST);
		ship.moveBackward();
		assertThat(ship.getLocation().getPoint().getX()).isEqualTo(26);
		assertThat(ship.getLocation().getPoint().getY()).isEqualTo(15);
		}
	/*
	 * Implementing commands that turn the ship left (l).
	 */
	@Test
	public void test_WhenTurnLeftThenItIsLeftTurn() throws Exception {
		ship.getLocation().setDirection(Direction.NORTH);
		ship.turnLeft();
		assertThat(ship.getLocation().getPoint().getY()).isEqualTo(15);
		assertThat(ship.getLocation().getPoint().getX()).isEqualTo(26);
		}
	/*
	 * Implementing commands that turn the ship right (r).
	 */
	@Test
	public void test_WhenTurnRightThenItIsRightTurn() throws Exception {
		ship.getLocation().setDirection(Direction.SOUTH);
		ship.turnRight();
		assertThat(ship.getLocation().getPoint().getY()).isEqualTo(15);
		assertThat(ship.getLocation().getPoint().getX()).isEqualTo(26);
		}
}
