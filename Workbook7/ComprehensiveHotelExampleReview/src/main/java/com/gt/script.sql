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