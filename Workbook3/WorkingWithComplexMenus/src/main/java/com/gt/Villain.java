package com.gt;

class Villain {
    private String name;
    private String origin;
    private String motivation;

    public Villain(String name, String origin, String motivation) {
        this.name = name;
        this.origin = origin;
        this.motivation = motivation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getMotivation() {
        return motivation;
    }

    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Origin: " + origin +", Motivation: " + motivation;
    }
}