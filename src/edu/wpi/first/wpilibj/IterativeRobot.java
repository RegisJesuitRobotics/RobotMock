package edu.wpi.first.wpilibj;

public abstract class IterativeRobot {
	abstract public void robotInit();

	public IterativeRobot() {
		super();
		robotInit();
	}

}
