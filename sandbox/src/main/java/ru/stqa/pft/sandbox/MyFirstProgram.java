package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Iryna");

    Square s = new Square(5);

    System.out.println("Square = " + s.area());

    Rectangle r = new Rectangle(4, 6);

    System.out.println("Rectangle = " + r.area());
  }

  public static void hello(String s){
    System.out.println("Hello, " + s + "!");
  }

}