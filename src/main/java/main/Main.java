package main.java.main;

import main.java.creator.BallCreator;
import main.java.entity.Ball;
import main.java.entity.Color;
import main.java.out.PrintBalls;
import main.java.service.BallService;
import main.java.service.impl.BallServiceImpl;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    PrintBalls printer = new PrintBalls();
    BallCreator ballCreator = new BallCreator();
    BallService service = new BallServiceImpl();
    List<Ball> balls = ballCreator.createBalls(10);
    System.out.println("Your set of balls");
    printer.printBalls(balls);
    System.out.println("Total weight of this balls is " + service.findCommuneWeight(balls));
    System.out.println("The number of balls of color " + Color.RED + " is " + service.findNumberOfBallsByColor(balls, Color.RED));
  }
}
