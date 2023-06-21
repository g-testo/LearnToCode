USE sys;

DROP DATABASE IF EXISTS kittyCatDatabase;

CREATE DATABASE IF NOT EXISTS kittyCatDatabase;

USE kittyCatDatabase;

CREATE TABLE cats(
	id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50),
    color VARCHAR(50),
    image_url VARCHAR(200),
    PRIMARY KEY(id)
);

INSERT INTO cats (name, color, image_url)
    VALUES
        ("Mia", "Brown and white", "https://www.exampleImage.com/miaKittyImage.jpg"),
        ("Kitty", "Gray", "https://www.exampleImage.com/kittyKittyImage.jpg"),
        ("Leo", "Orange tabby", "https://www.exampleImage.com/leoKittyImage.jpg"),
        ("Oliver", "Black and white", "https://www.exampleImage.com/oliverKittyImage.jpg"),
        ("Luna", "Calico", "https://www.exampleImage.com/lunaKittyImage.jpg"),
        ("Charlie", "Brown tabby", "https://www.exampleImage.com/charlieKittyImage.jpg"),
        ("Lucy", "White", "https://www.exampleImage.com/lucyKittyImage.jpg"),
        ("Max", "Orange", "https://www.exampleImage.com/maxKittyImage.jpg"),
        ("Milo", "Gray tabby", "https://www.exampleImage.com/miloKittyImage.jpg"),
        ("Simba", "Orange tabby", "https://www.exampleImage.com/simbaKittyImage.jpg"),
        ("Chloe", "Tortoiseshell", "https://www.exampleImage.com/chloeKittyImage.jpg"),
        ("Sophie", "Black", "https://www.exampleImage.com/sophieKittyImage.jpg"),
        ("Shadow", "Gray", "https://www.exampleImage.com/shadowKittyImage.jpg"),
        ("Jack", "Brown tabby", "https://www.exampleImage.com/jackKittyImage.jpg"),
        ("Lola", "Calico", "https://www.exampleImage.com/lolaKittyImage.jpg"),
        ("Tiger", "Orange and black stripes", "https://www.exampleImage.com/tigerKittyImage.jpg"),
        ("Rocky", "Brown and white", "https://www.exampleImage.com/rockyKittyImage.jpg"),
        ("Coco", "Chocolate", "https://www.exampleImage.com/cocoKittyImage.jpg"),
        ("Molly", "Gray", "https://www.exampleImage.com/mollyKittyImage.jpg"),
        ("Oscar", "Black", "https://www.exampleImage.com/oscarKittyImage.jpg"),
        ("Jasper", "Orange tabby", "https://www.exampleImage.com/jasperKittyImage.jpg"),
        ("Ginger", "Orange", "https://www.exampleImage.com/gingerKittyImage.jpg"),
        ("Ruby", "Red", "https://www.exampleImage.com/rubyKittyImage.jpg"),
        ("Smokey", "Gray", "https://www.exampleImage.com/smokeyKittyImage.jpg"),
        ("Bella", "White", "https://www.exampleImage.com/bellaKittyImage.jpg"),
        ("Mittens", "Black and white", "https://www.exampleImage.com/mittensKittyImage.jpg"),
        ("Tigger", "Orange and black stripes", "https://www.exampleImage.com/tiggerKittyImage.jpg"),
        ("Zoe", "Gray", "https://www.exampleImage.com/zoeKittyImage.jpg"),
        ("Sammy", "Brown tabby", "https://www.exampleImage.com/sammyKittyImage.jpg"),
        ("Lily", "Calico", "https://www.exampleImage.com/lilyKittyImage.jpg");
