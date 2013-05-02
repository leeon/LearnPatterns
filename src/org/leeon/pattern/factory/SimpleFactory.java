package org.leeon.pattern.factory;


/**
 * A simple Factory which is not good for extending.Usually this is okay for simple situations.
 * @author leeon
 * 2013-05-02
 * */

public class SimpleFactory {

	public static Product createProduct(){
		return new Product();
	}
}
