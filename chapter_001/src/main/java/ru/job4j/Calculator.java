package ru.job4j;
/**
 * Класс Калькулятор.
 * @author mosipov
 * @since 18.12.2016
 * @version 1
 */
 public class Calculator {
/**
 * Класс Калькулятор.
 * @author mosipov
 * @since 18.12.2016
 * @version 1
 *
 */
	 private double result = 0;
	/**
	 * сложение.
	 * @author mosipov
	 * @since 06.12.2016
	 *
	 * @param first double **param**
	 * @param second double **param**
	 */
	 public void add(double first, double second) {
		 this.result = first + second;
	 }
	/**
	 * вычитание.
	 * @author mosipov
	 * @since 06.12.2016
	 *
	 * @param first double **param**
	 * @param second double **param**
	 */
	 public void substruct(double first, double second) {
		 this.result = first - second;
	 }
	/**
	 * деление.
	 * @author mosipov
	 * @since 06.12.2016
	 *
	 * @param first double **param**
	 * @param second double **param**
	 */
	 public void div(double first, double second) {
		 this.result = first / second;
	 }
	/**
	 * умножение.
	 * @author mosipov
	 *
	 * @param first double **param**
	 * @param second double **param**
	 */
	 public void multiple(double first, double second) {
		 this.result = first * second;
	 }
	/**
	 * возвращаетрезультат.
	 * @author mosipov
	 * @since 18.12.2016
	 *
	 * @return  double double
	 */
	 public double getResult() {
		 return this.result;
	 }
 }