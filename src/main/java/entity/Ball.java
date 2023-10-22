package main.java.entity;

import main.java.exception.InputDataException;

public class Ball {
  public static final double MIN_WEIGHT = 200.0;
  public static final double MAX_WEIGHT = 500.0;
  public static final double MIN_RADIUS = 5.0;
  public static final double MAX_RADIUS = 15.0;

  private double weight;
  private double radius;
  private Color color;
  private Type type;

  public Ball(double weight, double radius, Color color, Type type) throws InputDataException {
    setWeight(weight);
    setRadius(radius);
    setColor(color);
    setType(type);
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) throws InputDataException {
    if (weight < MIN_WEIGHT || weight > MAX_WEIGHT) {
      throw new InputDataException("Not correct weight: " + weight);
    }
    this.weight = weight;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) throws InputDataException {
    if (radius < MIN_RADIUS || radius > MAX_RADIUS) {
      throw new InputDataException("Not correct radius " + radius);
    }
    this.radius = radius;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "Ball{" +
            "weight=" + weight +
            ", radius=" + radius +
            ", color=" + color +
            ", type=" + type +
            '}';
  }

}
