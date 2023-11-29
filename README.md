# Student-Course-Registration-Management-System

## Overview
This project centers around the development of a server-side application dedicated to managing a student course registration system. The application is designed to facilitate the registration of new students, the creation of new classes or courses, and the enrollment of students into existing courses, with all pertinent details stored in a database.

Key functionalities include the ability to validate student details, ensuring each student possesses a unique ID, a valid email address, and a balance sufficient to cover the associated course costs. This undertaking aims to create an efficient and reliable system that enhances the student registration process, showcasing participants' prowess in server-side application development.

## System Overview
This is a Java-based application developed using the NetBeans Integrated Development Environment (IDE). The system aims to facilitate the enrollment and management of students in various courses offered by the institution. The application includes features such as student and course details, enrollment management, and report generation.

### Features and Functionality
1. Student and Course Details
   
The application will maintain a comprehensive database of students and courses, the student database will store details such as name, contact number, email, and date of birth, while the course database will store details such as course code, course name, instructor name, max number of allowed students and course fees.

2. Enrollment Management
The system will enable the institution to add or delete enrollment records, students can be enrolled in multiple courses simultaneously, the system will also generate an invoice for the course fees.

3. Report Generation
The application will generate an up-to-date tables for all students registered in the system, all courses available and the students enrollment history on the system.

### Technologies used 
1.	This is a Java-based application developed using the NetBeans Integrated Development Environment (IDE).
2.	The application will use MySQL as the Database Management System (DBMS).
3.	The application will interact with the MySQL DBMS using JDBC (Java Database Connectivity) API.
 
   
## Database Design
The system uses a MySQL database with the following structure:

Tables
1. Students - details like id, name, email etc
2. Courses - details like id, name, fees etc
3. Registrations - enrollment details
   
## Sequence Diagrams
The key workflows are:
1. Student registration
   
3. Course registration
4. Student deletion
5. Course deletion
6. Edit student
7. Edit course
8. Enroll student in course
   
## Getting Started
### Prerequisites
1. Java 8
2. NetBeans 8.2+
3. MySQL

### Installation
1. Clone the repo
2. Configure the database connection in NetBeans
3. Run SQL scripts to create the database schema
4. Build and run the project in NetBeans
   
### Usage
The system allows admins to:
1. Register new students and courses
2. Edit or delete existing students and courses
3. Enroll students in courses
4. Generate reports
   
The workflows are facilitated through the NetBeans user interface.
