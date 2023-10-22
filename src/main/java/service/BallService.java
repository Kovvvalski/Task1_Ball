package main.java.service;

import main.java.entity.Ball;
import main.java.entity.Color;

import java.util.List;

public interface BallService {
  double findCommuneWeight(List<Ball> balls);

  int findNumberOfBallsByColor(List<Ball> balls, Color color);
}
