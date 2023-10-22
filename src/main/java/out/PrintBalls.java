package main.java.out;

import main.java.entity.Ball;

import java.util.List;

public class PrintBalls {
  public void printBalls(List<Ball> balls) {
    for (Ball ball : balls) {
      System.out.println(ball.toString());
    }
  }
}
