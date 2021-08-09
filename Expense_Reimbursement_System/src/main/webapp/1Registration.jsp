<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

  <title>Welcome to Bharathinfo.msdk</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>

<style>
h1 {text-align: center;}
h2 {text-align: center;}
h3 {text-align: center;}
</style>

<style>
body {
  background-image: url('signupbg.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>
<body>
    
<div class="container">
  <h1> <b>Bharathinfo.msdk</b> </h1>
  <h2>Welcome to our Expense Reimbursement Portal </h2>
  <h3>New user please register for sign up </h3>

<form action="http://localhost:8080/Expense_Reimbursement_System/RegistrationServlet" method="post">
            
  <table class="table table-hover">
  
      <tr>
        <td><b>Employee ID</b></td>
        <td><Input  type="text" name="id" required></td>
       
      </tr>
      <tr>
        <td><b>Password</b></td>
        <td><Input  type="password" name="pwd" required></td>
       
      </tr>
    
    <tbody>
      <tr>
        <td><b>First Name</b></td>
        <td><input  type="text" name="fname" required></td>
      </tr>
      
      <tr>
        <td><b>Last Name</b></td>
        <td><input  type="text" name="lname" required></td>
      </tr>
      
      <tr>
        <td><b>Department</b></td>
        <td><input  type="text" name="dep" required></td>
      </tr>
      
       <tr>
        <td><b>Designation</b></td>
        <td><input  type="text" name="des" required></td>
      </tr>
      
       <tr>
        <td><b>Email ID</b></td>
        <td><input  type="email" name="email" required></td>
      </tr>
      
      <tr>
        <td><b>Phone no.</b></td>
        <td><input  type="tel" name="phoneno" required></td>
      </tr>
      
      <tr>
        <td><b>Employee Type</b></td>
        <td><select name="type"> 
        			 <option value="employee">Employee</option>
                     <option value="manager">Manager</option>     
        </select></td>       
      </tr>
      
      <tr>
        <td><input type="reset" value="Cancel"></td>
        <td><input type="submit" value="submit"> </td>
        
      </tr>
      <p><b>Already have an account?</b><a href="http://localhost:8080/Expense_Reimbursement_System/2Login.jsp"><b>user login here</b></a> </p>
      
   </tbody>
  </table>
 </form>
</div>

</body>
</html>