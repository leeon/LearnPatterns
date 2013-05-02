package org.leeon.pattern.factory;

import org.leeon.pattern.factory.method.EnKeyboardFactory;
import org.leeon.pattern.factory.method.Keyboard;
import org.leeon.pattern.factory.method.KeyboardFactory;
import org.leeon.pattern.factory.method.SymbolKeyboardFactory;

public class FactoryDemo {

	public static void main(String[] args){
		
		Product product = SimpleFactory.createProduct();
		product.setName("A product made in SimpleFactory");
		System.out.println(product.getName());
		
		//here we have two factory to make different types of keyboards
		KeyboardFactory mEnKeyboardFactory = new EnKeyboardFactory();
		KeyboardFactory mSymbolKeyboardFactory = new SymbolKeyboardFactory();
		
		//And different types of keyboard may have different themes
		mEnKeyboardFactory.showKeboard(Keyboard.ThemeType.DEFAULT);
		mSymbolKeyboardFactory.showKeboard(Keyboard.ThemeType.NIGHT);
	}
}
 