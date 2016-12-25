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
		return sqrt((this.x - point.x) * (this.x - point.x) + (this.y - point.y) * (this.y - point.y));
	}
}
/**
 * Класс треугольника.
 * @author mosipov
 * @since 18.12.2016
 * @version 1
 *
 */
public class Triangle {
	/**точка 1.  */
	private Point a;
	/**точка 2.  */
	private Point b;
	/**точка 3.  */
	private Point c;
	/**
	 * создание треугольника.
	 * @author mosipov
	 * @since 06.12.2016
	 *
	 * @param a Point **param**
	 * @param b Point **param**
	 * @param c Point **param**
	 */
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	/**
	 * возвращаетрезультат.
	 * @author mosipov
	 * @since 18.12.2016
	 *
	 * @return  double double
	 */
	public double area() {
		//calculate the triangle area
		// if -1 then ( triangle not possible ) => return -1
		boolean triangleIsPossible = FALSE;
		double sideAB = this.a.distanceTo(this.b);
		double sideBC = this.b.distanceTo(this.c);
		double sideCA = this.c.distanceTo(this.a);
		double halfPerimetr = (sideAB + sideBC + sideCA) / 2;
		if ((sideAB + sideBC) > (sideCA)) {
			//return square
			return sqrt(halfPerimetr * (halfPerimetr - sideAB) * (halfPerimetr - sideBC) * (halfPerimetr - sideCA));
		} else {
			return -1;
		}
	}
}