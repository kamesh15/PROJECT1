<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<style>
h1 {text-align: center;}
h2 {text-align: center;}
body {
  background-image: url('admin.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}

.center {
  margin: auto;
  width: 40%;
  border: 3px solid #fc0585;
  padding: 10px;
}
</style>

<title>Manger Home Page</title>
</head>
<body>
<h1><b>Bharathinfo.msdk</b></h1>
<h2><b>Welcome to Manager Home Page</b></h2>

<div class="center">
<form action="http://localhost:8080/Expense_Reimbursement_System/Viewallreimrequest"  method="post">
<input type="submit" value=" View all Reimbursement Requests">
</form>

<form action="http://localhost:8080/Expense_Reimbursement_System/3Application.jsp"  method="post">
<input type="submit" value=" Approve/Deny Reimbursement Requests ">
</form>

<form action="http://localhost:8080/Expense_Reimbursement_System/Viewallapproved"  method="post">
<input type="submit" value=" View all approved Reimbursement Requests">
</form>

<form action="http://localhost:8080/Expense_Reimbursement_System/Viewalldenied"  method="post">
<input type="submit" value=" View all Denied Reimbursement Requests">
</form>
</div>

<div class="center">
<form action="http://localhost:8080/Expense_Reimbursement_System/2Login.jsp"  method="post">
<input type="submit" value=" Log out">
</form>
</div>


</body>
</html>