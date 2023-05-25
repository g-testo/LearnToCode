package com.yearup.paint;


import java.awt.*;

public class MainApp
{
    static World world = new World(200, 200); // x (-100, 100), y(-100, 100);
    static Turtle turtle = new Turtle(world,0, 0);
    public static void main(String[] args)
    {

        turtle.setDelay(2);
        turtle.setColor(Color.BLUE);

        makeSquare();

        turtle.setColor(Color.BLACK);
        turtle.turnRight(180);

        makeSquare();

    }

    public static void makeSquare(){
        for(int i=0;i<4;i++){
            turnAndMove(75, 90);
        }
    }

    public static void turnAndMove(int forwardAmount, int turnDegrees){
        turtle.forward(forwardAmount);
        turtle.turnRight(turnDegrees);
        turtle.setDelay(2);
    }
}
