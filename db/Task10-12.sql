USE Human_friends;

DROP TABLE IF EXISTS horse_and_donkey;
CREATE TABLE horse_and_donkey (
	id INT PRIMARY KEY AUTO_INCREMENT,
	name CHAR(30),
    commands TEXT,
    date_of_birth DATE,
    type_of_animal CHAR(30)
);

INSERT INTO horse_and_donkey (name,commands, date_of_birth, type_of_animal)
SELECT name, commands, date_of_birth, 'horse' AS type_animal FROM horse 
UNION
SELECT name, commands, date_of_birth, 'donkey' AS type_animal FROM donkey  ;


DROP TABLE IF EXISTS pets;
CREATE TABLE pets (
	id INT PRIMARY KEY AUTO_INCREMENT,
	name CHAR(30),
    commands TEXT,
    date_of_birth DATE,
    type_of_animal CHAR(30)
);

INSERT INTO pets (name,commands, date_of_birth, type_of_animal)
	SELECT name, commands, date_of_birth, 'cat' AS type_of_animal FROM cat
	UNION
	SELECT name, commands, date_of_birth, 'dog' AS type_of_animal FROM dog 
	UNION
	SELECT name, commands, date_of_birth, 'hamster' AS type_of_animal FROM hamster;



DROP TABLE IF EXISTS all_animals;
CREATE TABLE all_animals (
	id INT PRIMARY KEY AUTO_INCREMENT,
	name CHAR(30),
    commands TEXT,
    date_of_birth DATE,
    type_of_animal CHAR(30),
    type_of_pet CHAR(30)
);

INSERT INTO all_animals (name,commands, date_of_birth, type_of_animal, type_of_pet)
	SELECT name, commands, date_of_birth, type_of_animal, 'pack_pet' AS type_of_pet 
		FROM horse_and_donkey
UNION
	SELECT name, commands, date_of_birth, type_of_animal, 'pet' AS type_of_pet 
		FROM pets;




DROP TABLE IF EXISTS young_pets;
CREATE TABLE young_pets (
	id INT PRIMARY KEY AUTO_INCREMENT,
	name CHAR(30),
    type_of_animal CHAR(30),
    age INT
);

INSERT INTO young_pets (name, type_of_animal, age)
	SELECT name, type_of_animal, TIMESTAMPDIFF(YEAR, date_of_birth, CURDATE()) AS age FROM all_animals 
WHERE TIMESTAMPDIFF(YEAR, date_of_birth, CURDATE()) > 1 AND TIMESTAMPDIFF(YEAR, date_of_birth, CURDATE()) < 3;
	



