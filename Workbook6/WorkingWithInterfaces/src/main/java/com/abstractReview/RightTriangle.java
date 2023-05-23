package com.abstractReview;

public class RightTriangle extends Shape{
    private float base;
    private float height;
    @Override
    public float calcArea(){
        return (this.base * this.height)/2;
    }

//    a+b+a2+b2
    @Override
    public float calcPerimeter(){
        double baseSquared = Math.pow(this.base, 2);
        double heightSquared = Math.pow(this.height, 2);
        float sqrt = (float)Math.sqrt(baseSquared + heightSquared);

        return this.base + this.height + sqrt;
    }

}
