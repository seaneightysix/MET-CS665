package edu.bu.met.cs665.behaviors;

import edu.bu.met.cs665.meansOfTransportation.MeansOfTransportation;

public class BrakeParachute implements BrakeBehavior {

	@Override
	public boolean brake(MeansOfTransportation mot, double reducedSpeed) {
		// This kind of additional brake is for higher speed.
		if (mot.getSpeed() > 400) {
			System.out.println("A drogue parachute Brake is applied!."
					+ " A parachute attached to the rear of a plane and opened to assist braking.");
			mot.setSpeed(reducedSpeed);
			return true;
		}
		
		return false;

	}
}