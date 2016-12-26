package ru.job4j;
/**
 * Класс точки.
 * @author mosipov
 * @since 18.12.2016
 * @version 1
 *
 */
public class Point {
	/** X точки.  */
	private double x;
	/** Y точки.  */
	private double y;
	/**
	 * создание точки.
	 * @author mosipov
	 * @since 25.12.2016
	 *
	 * @param x Double **param**
	 * @param y Double **param**
	 */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * дистанция до точки от текущей.
	 * @author mosipov
	 * @since 25.12.2016
	 *
	 * @param point Point **param**
	 * @return  double double
	 */
	public double distanceTo(Point point) {
		//calculate distance between two points
		return Math.sqrt((this.x - point.x) * (this.x - point.x) + (this.y - point.y) * (this.y - point.y));
	}
}