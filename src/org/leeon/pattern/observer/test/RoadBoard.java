package org.leeon.pattern.observer.test;

import org.leeon.pattern.observer.Observer;
/**
 * This is an instance of observer, it will show the result of lights color changing.
 * @author leeon
 * 2013.4.29
 * */
public class RoadBoard implements Observer{

	private LightsData mLightsData;
	
	@Override
	public void update(Object data) {
		if(data instanceof LightsData){
			mLightsData = (LightsData)data;
			System.out.println("The "+ mLightsData.getLightState()+" light is lighted.");
		}
		
	}

}
