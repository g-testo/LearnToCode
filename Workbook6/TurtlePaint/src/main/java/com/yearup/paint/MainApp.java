package com.yearup.paint;


import java.awt.*;

public class MainApp
{
    static World world = new World(200, 200); // x (-100, 100), y(-100, 100);
    static Turtle turtle = new Turtle(world,0, 0);
    public static void main(String[] args)
    {
        turtle.setDelay(0.0);
//        makeSquare(30, 1, Color.BLUE); // Enum
//        turtle.turnRight(180);
//        makeSquare(90, 2, Color.RED);

//        makeTriangle(80, "left");
//        turtle.turnRight(180);
//        makeTriangle(30, "right");

        double radius = 50;
        double circumference = 2 * Math.PI * radius;
        double lineLength = circumference / 360;

        for(int degrees = 360; degrees > 0; degrees--){
            turtle.forward(lineLength);
            turtle.turnLeft(1);
        }


    }

    public static void makeTriangle(int sideOfTriangle, String direction){
        for(int i=0;i<3;i++){
            turnAndMove(sideOfTriangle, 120, direction);
        }
    }

    public static void makeSquare(int sidesLength, int delay, Color color){
        turtle.setColor(color);
        turtle.setDelay(delay);
        for(int i=0;i<4;i++){
            turnAndMove(sidesLength, 90, "right");
        }
    }

    public static void turnAndMove(int forwardAmount, int turnDegrees, String direction){
        turtle.forward(forwardAmount);
        if(direction.equalsIgnoreCase("right")){
            turtle.turnRight(turnDegrees);
        } else if(direction.equalsIgnoreCase("left")){
            turtle.turnLeft(turnDegrees);
        } else {
            System.out.println("Direction not found");
        }
    }
}
