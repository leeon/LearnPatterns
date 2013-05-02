package org.leeon.pattern.factory.method;

public class EnKeyboardFactory extends KeyboardFactory {

	private Theme mTheme;
	private Keyboard keyboard;
	
	@Override
	public Keyboard createKeyboard(Keyboard.ThemeType theme) {
		
		
		System.out.println("Making a EnKeyboard with a new theme");
		//Here are somethings to do according to different keyboard type
		mTheme = new Theme(); // in real time this mey has a file arguments
		switch (theme) {
		case DEFAULT:
			mTheme.setColor_background("Black");
			mTheme.setColor_key("Grey");
			break;
		case NIGHT:
			mTheme.setColor_background("Blue");
			mTheme.setColor_key("Black");
			break;
		default:
			mTheme.setColor_background("Black");
			mTheme.setColor_key("Grey");
			break;
		}
		keyboard = new EnKeyboard(mTheme);
		

		
		return keyboard;
	}

}
