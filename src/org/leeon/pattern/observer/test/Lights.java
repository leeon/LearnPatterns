package org.leeon.pattern.observer.test;

import java.util.ArrayList;

import org.leeon.pattern.observer.Observer;
import org.leeon.pattern.observer.Subjects;

/**
 * This is a instance of subjects containing data of a traffic light
 * @author leeon
 * 2013.4.29
 * */
public class Lights implements Subjects{

	private ArrayList<Observer> observers;
	private boolean changed = false;
	private LightsData mLightData;
	
	public Lights(){
		observers = new ArrayList<Observer>();
		//mLightData = new LightsData();
	}
	
	public boolean hasChanged() {
		return changed;
	}

	public void setChanged() {
		this.changed = true;
	}
	
	public void clearChanged(){
		this.changed = false;
	}


	/*In this version, a notify task is inspired by any setting invoke*/
	public void setLightData(LightsData mLightData) {
		this.mLightData = mLightData;
		this.setChanged();
		this.notify(mLightData);
	}
	
	/*To add a new observer*/
	@Override
	public void registerObserver(Observer o) {
		if(observers != null){
			if(!observers.contains(o))
			observers.add(o);			
		}
	}
	/*To remove a existing observer*/
	@Override
	public void removeObserver(Observer o) {
		if(observers != null){
			if(observers.contains(o)){
				observers.remove(o);
			}
		}
	}
	/*To notify all the observers*/
	@Override
	public void notify(Object data) {
		//TODO handle the particular nofity condition
		int size = observers.size();
		for(int i = 0; i < size; i++){
			Observer o = observers.get(i);
			o.update(data);
		}
		clearChanged();
	}

}
