DROP TABLE IF EXISTS hotels;
DROP TABLE IF EXISTS floors;
DROP TABLE IF EXISTS rooms;

CREATE TABLE hotels(
    id int NOT NULL AUTO_INCREMENT,
    name varchar(255),
    totalFloors int,
    totalOccupancy int,
    PRIMARY KEY(id)
);

CREATE TABLE floors(
	id int NOT NULL AUTO_INCREMENT,
    number int,
    hotelId int,
    PRIMARY KEY(id)
);

CREATE TABLE rooms(
	id int NOT NULL AUTO_INCREMENT,
    number int,
    floorId int,
    PRIMARY KEY(id)
);


INSERT INTO hotels(id, name, totalFloors, totalOccupancy) VALUES(1, 'Gregs Gregarious Games and Fun', 23, 1000);
INSERT INTO hotels(id, name, totalFloors, totalOccupancy) VALUES(2, 'Starlet Disaster and Fun', 25, 100);
INSERT INTO hotels(id, name, totalFloors, totalOccupancy) VALUES(3, "Isaiah's Insane Island of Insanity", 3, 1112);

INSERT INTO floors(id, number, hotelId) VALUES(1,1,1);
INSERT INTO floors(id, number, hotelId) VALUES(2,2,1);
INSERT INTO floors(id, number, hotelId) VALUES(3,3,1);

INSERT INTO floors(id, number, hotelId) VALUES(4,1,2);
INSERT INTO floors(id, number, hotelId) VALUES(5,2,2);

INSERT INTO floors(id, number, hotelId) VALUES(6,1,3);
INSERT INTO floors(id, number, hotelId) VALUES(7,2,3);