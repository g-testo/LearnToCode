DROP TABLE IF EXISTS hotels;
DROP TABLE IF EXISTS floors;
DROP TABLE IF EXISTS rooms;

CREATE TABLE hotels(
    id int NOT NULL,
    name varchar(255),
    totalFloors int,
    totalOccupancy int,
    PRIMARY KEY(id)
);

CREATE TABLE floors(
	id int PRIMARY KEY,
    number int,
    hotelId int,
    PRIMARY KEY(id)
);

CREATE TABLE rooms(
	id int NOT NULL,
    number int,
    floorId int,
    PRIMARY KEY(id)
);