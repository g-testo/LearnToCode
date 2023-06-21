package com.gt.demo.models;

public class Cat {
    private Long id;
    private String name;
    private String color;
    private String imageUrl;

    public Cat() {}

    public Cat(String name, String color, String imageUrl) {
        this.name = name;
        this.color = color;
        this.imageUrl = imageUrl;
    }

    public Cat(Long id, String name, String color, String imageUrl) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
