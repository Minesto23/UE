CREATE TABLE Employee(
	emp_id INT AUTO_INCREMENT,
    first_name VARCHAR(20) not null,
    last_name VARCHAR(20) not null,
    birth_date DATE,
    gender ENUM('F','M'),
    year_salary DECIMAL(8,2),
    super_id INT,
    branch_id INT,
    PRIMARY KEY(emp_id)
);

CREATE TABLE Branch(
	branch_id INT PRIMARY KEY,
    branch_name VARCHAR(40),
    address VARCHAR(255),
    zip_code INT,
    phone VARCHAR(12),
    city VARCHAR(12),
    mgr_id INT,
    mgr_start_date DATE,
    FOREIGN KEY(mgr_id) REFERENCES Employee(emp_id) ON DELETE SET NULL

);

ALTER TABLE Employee
ADD FOREIGN KEY(branch_id)
REFERENCES Branch(branch_id)
ON DELETE SET NULL;

ALTER TABLE Employee
ADD FOREIGN KEY(super_id)
REFERENCES Employee(emp_id)
ON DELETE SET NULL;

CREATE TABLE Client (
	client_id INT AUTO_INCREMENT PRIMARY KEY,
    client_name VARCHAR(40),
    branch_id INT,
    

);