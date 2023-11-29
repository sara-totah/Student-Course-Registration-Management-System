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

![database_diagram](https://github.com/sara-totah/Student-Course-Registration-Management-System/assets/62484242/a0f82eb2-ff5f-4083-bb5c-1cbb25956aa6)

•	Table 1: Students:

Fields: student_id, name, major, age, email, mobile, city, balance.


•	Table 2: Courses:

Fields: course_id, course_name, instructor_name, max_students, course_fee.


•	Table 3: Registrations:

Fields: enrollment_id, student_id, course_id.


Tables
1. Students - details like id, name, email etc
2. Courses - details like id, name, fees etc
3. Registrations - enrollment details
   
## Sequence Diagrams
The key workflows are:

1. Student registration

![student_reg_diagram](https://github.com/sara-totah/Student-Course-Registration-Management-System/assets/62484242/4ec06bbe-46b7-4c4c-8db4-970301044dc7)

•	Admin -> Registration System: Enter Student ID

•	Admin -> Registration System: Enter Personal Details

•	Admin -> Registration System: Enter Contact Details

•	Admin -> Registration System: Enter Money Balance

•	Admin -> Registration System: Submit Application


•	Registration System -> Database: Store Student Information

•	Database -> Registration System: Confirmation of Successful Storage


•	Registration System -> Admin: Confirmation of Successful Registration


•	Database -> Registration System: Update the Students Table Display

2. Course registration

![newCoureReg](https://github.com/sara-totah/Student-Course-Registration-Management-System/assets/62484242/46d2715b-39d4-41e5-b412-5f2b02bec1d7)

•	Admin -> Administration System: Enter Course Id

•	Admin -> Administration System: Enter Course Name

•	Admin -> Administration System: Enter Course Details

•	Admin -> Administration System: Enter Course Fees

•	Admin -> Administration System: Submit Course Information


•	Administration System -> Database: Store Course Information

•	Database -> Administration System: Confirmation of Successful Storage


•	Administration System -> Admin: Confirmation of Successful Registration


3. Student deletion

![deleteStudent](https://github.com/sara-totah/Student-Course-Registration-Management-System/assets/62484242/23b49873-2bf5-4287-a396-f8cc1e5e7160)

•	Admin -> Registration System: Enter Student ID

•	Admin -> Registration System: Enter Personal Details

•	Admin -> Registration System: Enter Contact Details

•	Admin -> Registration System: Enter Money Balance

•	Admin -> Registration System: Submit Application

(or click on the student details on the table display)


•	Registration System -> Database: Delete Student Information from students_table and from course_enrollment table.

•	Database -> Registration System: Confirmation of Successful Update


•	Registration System -> Admin: Confirmation of Successful Update


•	Database -> Registration System: Update the Students Table Display


4. Course deletion

![database_diagram](https://github.com/sara-totah/Student-Course-Registration-Management-System/assets/62484242/963e15e1-38c8-447b-addf-11eb47567873)

•	Admin -> Administration System: Enter Course Id

•	Admin -> Administration System: Enter Course Name

•	Admin -> Administration System: Enter Course Details

•	Admin -> Administration System: Enter Course Fees

•	Admin -> Registration System: Submit Application

(or click on the course details on the table display)


•	Registration System -> Database: Delete Course Information from courses table, and all enrollment into this course from course_enrollment table.

•	Database -> Registration System: Confirmation of Successful Update


•	Registration System -> Admin: Confirmation of Successful Update

•	Database ->Registration System: Update the Courses Table Display


5. Edit student

•	Admin ->Registration System: Enter Student ID

•	Admin ->Registration System: Enter Personal Details

•	Admin ->Registration System: Enter Contact Details

•	Admin ->Registration System: Enter Money Balance

•	Admin ->Registration System: Submit Application

(or click on the student details on the table display, and update the entry you want)


•	Registration System ->Database: Update Student Information in students_table

•	Database ->Registration System: Confirmation of Successful Update

•	Registration System ->Admin: Confirmation of Successful Update

•	Database ->Registration System: Update the Students Table Display

   
6. Edit course
•	Admin ->Administration System: Enter Course Id

•	Admin ->Administration System: Enter Course Name

•	Admin ->Administration System: Enter Course Details

•	Admin ->Administration System: Enter Course Fees

•	Admin ->Registration System: Submit Application

(or click on the student details on the table display, and update the entry you want)


•	Registration System ->Database: Update Course Information in course_table

•	Database ->Registration System: Confirmation of Successful Update


•	Registration System ->Admin: Confirmation of Successful Update


•	Database ->Registration System: Update the Course Table Display


7. Enroll student in course

•	Admin ->Registration System: Enter Student ID

•	Admin ->Registration System: Enter Course ID

•	Admin ->Registration System: Submit Application

•	Registration System ->Database: Get course fees amount and student balance

•	Database ->Registration System: Confirmation of Successful / Failed Enrollment

•	Registration System ->Admin: Confirmation of Successful / Failed Enrollment

•	Database ->Registration System: Update the Enrollment Table Display


## Getting Started
### Prerequisites
1. Java 8
2. NetBeans 8.2+
3. MySQL

### Installation
1. Clone the repo.
2. Open the project in NetBeans:
   • Launch NetBeans.
   
   • Select "File" > "Open Project" and navigate to the cloned repository.
  
3. Configure MySQL Database:
   
   • Open the MySQL Workbench or any MySQL client tool.
   
   • Create a new database for the project.
   
   • Run SQL scripts to create the database schema.
   
   • Update the database connection details in the config.properties file (if applicable).
   
4. Build and Run the Project:
   • Build the project in NetBeans.
   
   • Run the project.

   
### Usage
The system allows admins to:
1. Register new students and courses
2. Edit or delete existing students and courses
3. Enroll students in courses
4. Generate reports
   
The workflows are facilitated through the NetBeans user interface.
