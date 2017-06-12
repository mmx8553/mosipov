package ru.job4j.StrategyPattern;

public class Paint {
	private Shape shape;
	public Paint(Shape shape){
		this.shape = shape;
	}
	public void draw(){
		System.out.println(String.valueOf(this.shape.pic()));
	}
}