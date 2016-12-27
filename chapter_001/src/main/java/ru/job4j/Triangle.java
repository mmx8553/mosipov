package ru.job4j;
/**
 * Класс треугольника.
 * @author mosipov
 * @since 18.12.2016
 * @version 1
 *
 */
public class Triangle {
	/** точка 1.  */
	private Point a;
	/** точка 2.  */
	private Point b;
	/** точка 3.  */
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
		double sideAB = this.a.distanceTo(this.b);
		double sideBC = this.b.distanceTo(this.c);
		double sideCA = this.c.distanceTo(this.a);
		double halfPerimetr = (sideAB + sideBC + sideCA) / 2;
		if ((sideAB + sideBC) > (sideCA)) {
			//return square
			return Math.sqrt(halfPerimetr * (halfPerimetr - sideAB) * (halfPerimetr - sideBC) * (halfPerimetr - sideCA));
		} else {
			return -1;
		}
	}
}