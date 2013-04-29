package org.leeon.pattern.observer;

/**
 * Any observer can implements this.
 * @author leeon
 * 2013.4.29
 * */

public interface Observer {
	
	/*functions called when the data is changed*/
	public void update(Object data);
}
