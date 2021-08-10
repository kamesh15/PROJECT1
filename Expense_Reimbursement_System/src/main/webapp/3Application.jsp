<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Application Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
h1 {text-align: center;}
h2 {text-align: center;}

</style>
<style>
body {
  background-image: url('login2bg.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
* {
  box-sizing: border-box;
}

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  resize: vertical;
}

label {
  padding: 12px 12px 12px 0;
  display: inline-block;
}

input[type=submit] {
  background-color: #04AA6D;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  float: right;
}

input[type=submit]:hover {
  background-color: #45a049;
}

.container {
  border-radius: 5px;
  background-color: #ffeedb;
  padding: 20px;
  opacity: 0.9;
  
}

.col-25 {
  float: left;
  width: 25%;
  margin-top: 6px;
}

.col-75 {
  float: left;
  width: 75%;
  margin-top: 6px;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

@media screen and (max-width: 600px) {
  .col-25, .col-75, input[type=submit] {
    width: 100%;
    margin-top: 0;
  }
}
</style>
</head>
<body>
<h1><b>Bharathinfo.msdk</b></h1>
<h2><b>Reimbursement Application Form</b></h2>
<h3><b><i>Give appropriate details for your application</i></b></h3>

<form  action="http://localhost:8080/Expense_Reimbursement_System/EmployeeHomePage.jsp" method="post">
<P><b>If you are already applied for Reimbursement, go to home page </b>
<input type="submit" value="Click here and go to home page">
</form>
<form>
<p>------------------------------------------------------------------------------------------------------------------------------------
</form>

<div class="container">
  <form action="http://localhost:8080/Expense_Reimbursement_System/ApplicationServlet" method="post">
    <div class="row">
      <div class="col-25">
        <label for="empid">Employee ID</label>
      </div>
      <div class="col-75">
        <input type="text" id="empid"  name="empid" placeholder="your employee id" required>
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="name">Employee Name</label>
      </div>
      <div class="col-75">
        <input type="text" id="name"  placeholder="your name.." required>
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="type">Reimbursement Type</label>
      </div>
      <div class="col-75">
        <select id="type" name="type">
          <option value="Travel and Mileage Reimbursements">Travel and Mileage Reimbursements</option>
          <option value="Business Expense Reimbursements">Business Expense Reimbursements</option>
          <option value="Healthcare Reimbursements">Healthcare Reimbursements</option>
          <option value="Others">Others</option>
        </select>
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="amount">Amount to be Claimed</label>
      </div>
      <div class="col-75">
        <input type="text" id="amount" name="amount" placeholder="amount in inr" required>
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="invoice">Invoice Documents</label>
      </div>
      <div class="col-75">
        <input type="file" id="invoice" name="doc" placeholder="attach file here">
      </div>
    </div>
    
    <div class="row">
      <div class="col-25">
        <label for="subject">Description</label>
      </div>
      <div class="col-75">
        <textarea id="subject" name="subject" placeholder="Write something..." style="height:200px"></textarea>
      </div>
    </div>
    <div class="row">
      <input type="submit" value="Submit">
    </div>
  </form>
</div>

</body>
</html>
