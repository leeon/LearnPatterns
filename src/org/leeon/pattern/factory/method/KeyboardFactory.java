package org.leeon.pattern.factory.method;

public abstract class KeyboardFactory {
	Keyboard keyboard;
	
	//We are using a factory method to make a new keyboard
	public void showKeboard(Keyboard.ThemeType type){
		keyboard = createKeyboard(type);
		keyboard.drawBackgroud();
		keyboard.drwaKey();
		
	}
	/*for extending: every concrete Factory can made different keyboard*/
	public abstract Keyboard createKeyboard(Keyboard.ThemeType theme);
	

}
