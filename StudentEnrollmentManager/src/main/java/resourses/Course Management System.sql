CREATE TABLE IF NOT EXISTS students (
    student_id INT PRIMARY KEY,
    name VARCHAR(20),
    major VARCHAR(20),
    age INT,
    email VARCHAR(100) UNIQUE,
    mobile VARCHAR(20),
    city VARCHAR(20),
    balance DOUBLE
);

CREATE TABLE IF NOT EXISTS courses (
    course_id INT PRIMARY KEY,
    course_name VARCHAR(40),
    instructor_name VARCHAR(40),
    max_students INT,
    course_fee INT
);

CREATE TABLE IF NOT EXISTS student_enrollment (
    enrollment_id INT Unique NOT NULL AUTO_INCREMENT,
    student_id INT,
    course_id INT,
    PRIMARY KEY(student_id, course_id),
    FOREIGN KEY(student_id) REFERENCES students(student_id),
    FOREIGN KEY(course_id) REFERENCES courses(course_id)
); 
