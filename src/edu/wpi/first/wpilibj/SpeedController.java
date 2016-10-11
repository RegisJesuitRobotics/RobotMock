package edu.wpi.first.wpilibj;

import javax.management.RuntimeErrorException;

public class SpeedController {
	static int position = 2;
	int pwmNumber;
	static int direction = 0;
	
	public SpeedController(int pwmNumber) {
		super();
		this.pwmNumber = pwmNumber;
	}

	public void set(double value) {
		if (value == 0) {
			direction = 0;
		}
		else {
			if (value < 0) {
				direction = -1;
			}
			else {
				direction = 1;
			}
		}
        move();
	}
	
	static void move() {
		position += direction;
		System.out.println("position " + position);
		if (Math.abs(position) > 100) {
			throw new RuntimeException("Out of range");
		}
	}

	static int getPosition() {
		return position;
	}
	
	

}
