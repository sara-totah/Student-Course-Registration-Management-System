# Student-Course-Registration-Management-System

## Overview
This is a Java-based application developed using NetBeans IDE to manage student course registrations. The system includes:
1. Student and course database
2. Enrollment management
3. Report generation
   
## Features
1. Store student details like name, email, contact number etc.
2. Store course details like name, instructor, fees etc.
3. Add/delete enrollment records
4. Invoice generation
5. Student, courses and enrollment reports
   
## Technologies
1. Java
2. NetBeans
3. MySQL Database
   
## Database Design
The system uses a MySQL database with the following structure:
Tables
1. Students - details like id, name, email etc
2. Courses - details like id, name, fees etc
3. Registrations - enrollment details
   
## Sequence Diagrams
The key workflows are:
1. Student registration
2. Course registration
3. Student deletion
4. Course deletion
5. Edit student
6. Edit course
7. Enroll student in course
   
## Getting Started
### Prerequisites
. Java 8
. NetBeans 8.2+
. MySQL

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
