package edu.wpi.first.wpilibj;

public class Timer {
	public static void delay(int duration) {
		try {
			Thread.sleep(duration * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
