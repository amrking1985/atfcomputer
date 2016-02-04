CREATE TABLE Motorcycle_gang(
id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
name_of_gang VARCHAR(255),
location VARCHAR(255),
UNIQUE KEY name_of_gang (name_of_gang));

CREATE TABLE Member(
id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
gang_id BIGINT,
name VARCHAR(255),
rank VARCHAR(255),
status VARCHAR(25),
FOREIGN KEY(gang_id) REFERENCES Motorcycle_gang(id)
);


CREATE TABLE Crime(
id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
member_id BIGINT,
type_of_crime VARCHAR(255),
location_of_crime VARCHAR(255),
FOREIGN KEY(member_id) REFERENCES Member(id)
);

ALTER TABLE Member ADD UNIQUE(name);