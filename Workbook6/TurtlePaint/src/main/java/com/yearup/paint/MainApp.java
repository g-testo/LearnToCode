package com.yearup.paint;


import java.awt.*;

public class MainApp
{
    static World world = new World(200, 200); // x (-100, 100), y(-100, 100);
    static Turtle turtle = new Turtle(world,0, 0);
    public static void main(String[] args)
    {
        turtle.setDelay(0.001);

//        makeSquare(30); // Enum
//        turtle.turnRight(180);
//        makeSquare(90);

//        makeEquilateralTriangle(80, "left");
//        turtle.turnRight(180);
//        makeTriangle(30, "right");

//        turtle.penUp();
//        turtle.goTo(0, -25);
//
//        turtle.penDown();
//        makeCircle(25);
//        turtle.turnRight(90);
        makeRectangle(30, 50);
    }

    public static void makeRectangle(int width, int height){
        for(int i=0; i<4; i++){
            int sideToDraw;

            if(i%2==0){
                sideToDraw = width;
            } else {
                sideToDraw = height;
            }
            turnAndMove(sideToDraw, 90, "right");
//          turnAndMove(i%2==0 ? width: height, 90, "right");
        }

    }

    public static void drawNeighborhood(){
        for(int i=0;i<10;i++){
            drawHouse(20);
            turtle.goTo(turtle.getLocation().getX() + 20, 0);
        }
    }

    public static void drawHouse(int side){
        makeSquare(side);
        makeEquilateralTriangle(side, "left");
    }

    public static void makeCircle(double radius){
        double circumference = 2 * Math.PI * radius;
        double lineLength = circumference / 360;

        for(int degrees = 360; degrees > 0; degrees--){
            turtle.forward(lineLength);
            turtle.turnLeft(1);
        }
    }

    public static void makeTriangle(int sideA, int sideB, int angleA, int angleB){}

    public static void makeEquilateralTriangle(int sideOfTriangle, String direction){
        for(int i=0;i<3;i++){
            turnAndMove(sideOfTriangle, 120, direction);
        }
    }

    public static void makeSquare(int sidesLength){
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
