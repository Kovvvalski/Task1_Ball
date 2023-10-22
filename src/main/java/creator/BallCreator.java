package main.java.creator;

import main.java.entity.Ball;
import main.java.entity.Type;
import main.java.entity.Color;
import main.java.exception.InputDataException;

import java.util.Arrays;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class BallCreator {
  public List<Ball> createBalls(int size) {
    Random random = new Random();
    List<Ball> balls = new ArrayList<>();
    List<Color> colors = new ArrayList<>(Arrays.asList(Color.values()));
    List<Type> types = new ArrayList<>(Arrays.asList(Type.values()));
    for (int i = 0; i < size; i++) {
      double weight = random.nextDouble() * (Ball.MAX_WEIGHT - Ball.MIN_WEIGHT) + Ball.MIN_WEIGHT;
      double radius = random.nextDouble() * (Ball.MAX_RADIUS - Ball.MIN_RADIUS) + Ball.MIN_RADIUS;
      Color color = colors.get(random.nextInt(colors.size()));
      Type type = types.get(random.nextInt(types.size()));
      try {
        balls.add(new Ball(weight, radius, color, type));
      } catch (InputDataException e) {
        System.out.println(e.getMessage());
      }
    }
    return balls;
  }
}
