package org.leeon.pattern.decorator.test;

import org.leeon.pattern.decorator.Component;

public class Basket extends Component{

	public Basket(){
		this.setDescription("This is a Normal Basket:");
	}
	
	@Override
	public double cost() {
		return 5.0;
	}
	
}
