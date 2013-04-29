package org.leeon.pattern.observer.test;

import org.leeon.pattern.observer.Observer;
import org.leeon.pattern.observer.Subjects;
/**
 * A demo of Observer Pattern.
 * @author leeon
 * 2013.4.29
 * */

public class TestObserver {

	public static void main(String[] args) {
		Lights lights = new Lights();
		Observer board = new RoadBoard();
		LightsData data = new LightsData();
		
		lights.registerObserver(board);
		
		data.setLightState("red");
		lights.setLightData(data);
		
		data.setLightState("green");
		lights.setLightData(data);
	}

}
