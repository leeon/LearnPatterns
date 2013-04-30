package org.leeon.pattern.decorator.test;

import org.leeon.pattern.decorator.Component;

public class TestDecorator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component basket = new Basket();
		Component aBasket = new BananaDecorator(new AppleDecorator(basket));
		
		System.out.println(aBasket.getDescription());
		System.out.println("The total costs are $"+aBasket.cost());
	}

}
