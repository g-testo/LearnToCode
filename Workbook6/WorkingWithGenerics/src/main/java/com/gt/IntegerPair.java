package com.gt;

public class IntegerPair {
    private int leftNumber;
    private int rightNumber;

    public IntegerPair(int leftNumber, int rightNumber) {
        this.leftNumber = leftNumber;
        this.rightNumber = rightNumber;
    }

    public int getLeftNumber() {
        return leftNumber;
    }

    public void setLeftNumber(int leftNumber) {
        this.leftNumber = leftNumber;
    }

    public int getRightNumber() {
        return rightNumber;
    }

    public void setRightNumber(int rightNumber) {
        this.rightNumber = rightNumber;
    }

    public void swap(){
        int temp = this.leftNumber;
        this.leftNumber = this.rightNumber;
        this.rightNumber = temp;
    }

    @Override
    public String toString() {
        return "IntegerPair{" +
                "leftNumber=" + leftNumber +
                ", rightNumber=" + rightNumber +
                '}';
    }
}
