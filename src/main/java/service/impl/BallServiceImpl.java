package main.java.service.impl;

import main.java.entity.Ball;
import main.java.entity.Color;

import java.util.List;

public class BallServiceImpl implements main.java.service.BallService {
  @Override
  public double findCommuneWeight(List<Ball> balls) {
    double sum = 0;
    for (Ball ball : balls) {
      sum += ball.getWeight();
    }
    return sum;
  }

  @Override
  public int findNumberOfBallsByColor(List<Ball> balls, Color color) {
    int counter = 0;
    for (Ball ball : balls) {
      if (ball.getColor().equals(color)) {
        counter++;
      }
    }
    return counter;
  }
}
