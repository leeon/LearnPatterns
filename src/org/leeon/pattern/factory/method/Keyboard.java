package org.leeon.pattern.factory.method;

public abstract class Keyboard {
	private Theme theme;
	
	public Keyboard(Theme mTheme){
		this.theme = mTheme;
	}
	
	public void drawBackgroud(){
		System.out.println("drwaing background : "+theme.getColor_background());
	}
	
	public void drwaKey(){
		System.out.println("drawing keys : "+ theme.getColor_key());
	}
	
	public enum ThemeType{
		DEFAULT,NIGHT
	}
}
