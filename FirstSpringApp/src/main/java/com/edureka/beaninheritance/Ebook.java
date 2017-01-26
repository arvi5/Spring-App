package com.edureka.beaninheritance;

public class Ebook extends Book {
	private float sizeInMB;

	public float getSizeInMB() {
		return sizeInMB;
	}

	public void setSizeInMB(float sizeInMB) {
		this.sizeInMB = sizeInMB;
	}
	public String toString(){
		return "Ebook[sizeInMB:" +sizeInMB+","+super.toString()+"]";
		
	}

}
