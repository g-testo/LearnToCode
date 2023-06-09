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


INSERT INTO hotels VALUES(1, 'Gregs Gregarious Games and Fun', 23, 1000);
INSERT INTO floors VALUES(1,1,1);
INSERT INTO floors VALUES(2,2,1);
INSERT INTO floors VALUES(3,3,1);

INSERT INTO hotels VALUES(2, 'Starlet Disaster and Fun', 25, 100);
INSERT INTO floors VALUES(4,1,2);
INSERT INTO floors VALUES(4,2,2);

-- Query to find highest floor from hotel with id of 2
SELECT MAX(number) FROM floors WHERE hotelId = 2;


UPDATE rooms SET number = 101 WHERE id = 1;