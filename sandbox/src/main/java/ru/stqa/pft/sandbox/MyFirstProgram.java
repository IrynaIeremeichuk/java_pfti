package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Iryna");

    double l = 5;
    System.out.println("Square = " + area(l));

    double a = 4;
    double b = 6;

    System.out.println("Rectangle = " + area(a,b));
  }

  public static void hello(String s){
    System.out.println("Hello, " + s + "!");
  }

  public static double area(double l){
    return l * l;
  }

  public static double area(double a, double b){
    return a*b;
  }
}