package edu.wpi.first.wpilibj;

public class DigitalInput {
	public DigitalInput(int dioNumber) {
		super();
		this.dioNumber = dioNumber;
		if (dioNumber == 3) {
			positionForFalse = 0;
		}
		if (dioNumber == 8) {
			positionForFalse = 10;
		}
	}
	int dioNumber;
	int positionForFalse;
	
	public boolean get() {
		return !(positionForFalse == Talon.getPosition() || positionForFalse+1 == Talon.getPosition());
	}
	
	
}
