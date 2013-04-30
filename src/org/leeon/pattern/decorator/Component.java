package org.leeon.pattern.decorator;

/**
 * This demo just demonstrate the concepts of Component,and you can write your
 * own.
 * 
 * @author leeon 2013.4.30
 * */
public abstract class Component {

	private String description; // get some info

	public String getDescription() {

		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public abstract double cost();
}
