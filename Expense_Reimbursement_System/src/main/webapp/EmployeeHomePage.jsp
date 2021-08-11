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
  background-image: url('emplogin.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}

.center {
  margin: auto;
  width: 50%;
  border: 3px solid #a83255;
  padding: 10px;
}
</style>

<title>Employee Home Page </title>
</head>
<body>
<h1><b>Bharathinfo.msdk</b></h1>
<h2><b>Welcome to Employee Home Page</b></h2>
<div class="center">
<form action="http://localhost:8080/Expense_Reimbursement_System/3Application.jsp"  method="post">
<div class="row">
       <div class="col-25">
 <label for="empid">Click to Apply Reimbursement Application</label>
 </div>
 </div>
<input type="submit" value=" Reimbursement Application">
</form>
</div>

<div class="center">
<form action="http://localhost:8080/Expense_Reimbursement_System/Reimdetailsforemp"  method="post">
<div class="row">
      <div class="col-25">
        <label for="empid">Click to View Your Reimbursement Status</label>
      </div>
      <div class="col-75">
        <!--<input type="text" id="empid"  name="empid" placeholder="your employee id" required>-->
      </div>
    </div>
<input type="submit" value=" View Your Reimbursement Details">
</form>
</div>
<div class="center">
<form action="http://localhost:8080/Expense_Reimbursement_System/Detailsofemp"  method="post">
<div class="row">
      <div class="col-25">
        <label for="empid">Click to View Your Personal details</label>
      </div>
      <div class="col-75">
        <!--  <input type="text" id="empid"  name="empid" placeholder="your employee id" required>-->
      </div>
    </div>
<input type="submit" value=" View Your Personal Details">
</form>
</div>

<div class="center">
<form action="http://localhost:8080/Expense_Reimbursement_System/2Login.jsp"  method="post">
<input type="submit" value=" Log out">
</form>
</div>

</body>
</html>