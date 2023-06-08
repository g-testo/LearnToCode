
INSERT INTO hotels VALUES(1, 'Gregs Gregarious Games and Fun', 23, 1000);
INSERT INTO floors VALUES(1,1,1);
INSERT INTO floors VALUES(2,2,1);
INSERT INTO floors VALUES(3,3,1);

INSERT INTO hotels VALUES(2, 'Starlet Disaster and Fun', 25, 100);
INSERT INTO floors VALUES(4,1,2);
INSERT INTO floors VALUES(4,2,2);

-- Query to find highest floor from hotel with id of 2
SELECT MAX(number) FROM floors WHERE hotelId = 2;

--// Room
--    // id (Primary Key)
--    // number
--    // floorId (Foreign key)
