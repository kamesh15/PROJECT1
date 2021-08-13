create database HMS;

use ERS;

create table EmployeeDetails(Employee_id varchar(20) primary key,Password varchar(20)  not null unique,First_Name varchar(20),Last_Name varchar(20),Designation varchar(20),Department varchar(20),Email_ID varchar (20) unique,Phone_No varchar(20) ,Type varchar(20));

select * from EmployeeDetails;

create table ReimbursementDetails(Reimbursement_Id integer AUTO_INCREMENT PRIMARY KEY, Employee_id varchar(20) ,Reimbursement_Type varchar(50),Reimbursement_Amount double, Description varchar(100),Invoice_Documents longblob,Reimbursement_Status varchar(20), foreign key(Employee_id) references EmployeeDetails(Employee_id) ); 

select * from ReimbursementDetails;