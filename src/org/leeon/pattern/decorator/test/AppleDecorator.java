package org.leeon.pattern.decorator.test;

import org.leeon.pattern.decorator.Component;
import org.leeon.pattern.decorator.Decorator;

public class AppleDecorator extends Decorator{

	private Component wrapObj;
	
	public AppleDecorator(Component obj){
		this.wrapObj = obj;
		this.setDescription(" Apple");
	}

	
	@Override
	public void setDescription(String description) {
		// TODO Auto-generated method stub
		super.setDescription(wrapObj.getDescription()+description);
	}


	@Override
	public double cost() {
		return (wrapObj.cost()+1.9);
	}

}
