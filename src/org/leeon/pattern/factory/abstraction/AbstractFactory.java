package org.leeon.pattern.factory.abstraction;

import org.leeon.pattern.factory.Product;

public abstract class AbstractFactory {
	
	/*All subclasses should implements this method*/
	public abstract Product createProduct(String type);
}
