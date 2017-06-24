package ru.job4j.StrategyPattern;
/**
 * @since 01.06.2017
 */

 public class Paint {
	/** var. */
	private Shape shape;
	/** @param shape Shape  **param** */
	public Paint(Shape shape) {
		this.shape = shape;
	}
	/** method. */
	public void draw() {
		System.out.println(String.valueOf(this.shape.pic()));
	}
}