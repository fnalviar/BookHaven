CREATE TABLE customer(
	customer_id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	first_name VARCHAR(20),
	last_name VARCHAR(20),
	email VARCHAR(25),
	phone_number VARCHAR(10),
	username VARCHAR(25),
	password VARCHAR(25),
	role_id INT NOT NULL
);

CREATE TABLE role(
	role_id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	role_name VARCHAR(15),
	customer_id INT REFERENCES customer(customer_id)
);

CREATE TABLE orders(
	order_id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	order_timestamp TIMESTAMP,
	order_total NUMERIC (6,2),
	customer_id INT REFERENCES customer(customer_id)
);

CREATE TABLE payment(
	payment_id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	card_type VARCHAR(10) NOT NULL,
	card_name VARCHAR (25) NOT NULL,
	expiration_date VARCHAR(4) NOT NULL,
	cvv VARCHAR(3) NOT NULL,
	customer_id INT REFERENCES customer(customer_id)
);

CREATE TABLE book(
	book_id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	isbn INT NOT NULL,
	title VARCHAR(50),
	author_fname VARCHAR(20),
	author_lname VARCHAR(20),
	cover_image VARCHAR(265),
	sypnosis VARCHAR(265),
	price NUMERIC (6,2) NOT NULL,
	is_available BOOLEAN
);

CREATE TABLE cart(
	cart_id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	created_date TIMESTAMP,
	modified_date TIMESTAMP,
	is_removed BOOLEAN,
	cart_total NUMERIC (6,2),
	customer_id INT REFERENCES customer(customer_id),
	order_id INT REFERENCES orders(order_id)
);

CREATE TABLE billing(
	bill_id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	street_name VARCHAR(25),
	street_number INT,
	city VARCHAR(25),
	province VARCHAR(25),
	postal_code VARCHAR(6),
	customer_id INT REFERENCES customer(customer_id),
	order_id INT REFERENCES orders(order_id)
);