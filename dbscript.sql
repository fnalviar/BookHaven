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
	customer_id INT REFERENCES customer(customer_id) ON DELETE CASCADE
);

CREATE TABLE orders(
	order_id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	items JSON NOT NULL,
	order_timestamp TIMESTAMP,
	order_total NUMERIC (6,2) NOT NULL,
	customer_id INT REFERENCES customer(customer_id) ON DELETE CASCADE
);

CREATE TABLE payment(
	payment_id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	card_type VARCHAR(10) NOT NULL,
	card_name VARCHAR (25) NOT NULL,
	expiration_date VARCHAR(4) NOT NULL,
	cvv VARCHAR(3) NOT NULL,
	customer_id INT REFERENCES customer(customer_id) ON DELETE CASCADE
);

CREATE TABLE book(
	book_id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	isbn INT NOT NULL,
	title VARCHAR(50) NOT NULL,
	author_fname VARCHAR(20) NOT NULL,
	author_lname VARCHAR(20) NOT NULL,
	cover_image VARCHAR(265) NOT NULL,
	sypnosis VARCHAR(265) NOT NULL,
	price NUMERIC (6,2) NOT NULL,
	is_available BOOLEAN
);

CREATE TABLE cart(
	cart_id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	cart_items JSON NOT NULL,
	created_date TIMESTAMP,
	modified_date TIMESTAMP,
	is_removed BOOLEAN,
	cart_total NUMERIC (6,2) NOT NULL,
	customer_id INT REFERENCES customer(customer_id) ON DELETE CASCADE, 
	order_id INT REFERENCES orders(order_id) ON DELETE CASCADE
);

CREATE TABLE billing(
	bill_id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	street_name VARCHAR(25),
	street_number INT,
	city VARCHAR(25),
	province VARCHAR(25),
	postal_code VARCHAR(6),
	customer_id INT REFERENCES customer(customer_id) ON DELETE CASCADE,
	order_id INT REFERENCES orders(order_id) ON DELETE CASCADE
);