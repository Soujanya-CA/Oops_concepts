package com.technoelevate.objAsArgument;

public class Box {

	private int width;
	private int height;
	private int length;
	
	public Box(int width, int height, int length) {
		this.width = width;
		this.height = height;
		this.length = length;
	}
	
	public boolean isEqualBox(Box b)
	{
		if(this.width == b.width && this.height == b.height && this.length == b.length) {
			return true;
		}
		return false;
	}
	
	
}
