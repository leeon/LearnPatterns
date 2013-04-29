package org.leeon.pattern.observer;
/**
 * Subject interface 
 * @author leeon
 * 2013.4.29
 * */
public interface Subjects {

	/*add a new observer*/
	public void registerObserver(Observer o);
	/*remove a existing observer*/
	public void removeObserver(Observer o);
	/*a broadcast op*/
	public void notify(Object data);
}
