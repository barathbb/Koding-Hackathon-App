<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<!DOCTYPE html>
<html>
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    
  </head>

  <body>
    <div class="container">

      <h2>Login Page</h2>

      <form role="form" method="post">

        <div class="form-group">
          <label for="email">Email:</label>
          <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
        </div>
        <div class="form-group">
          <label for="pwd">Password:</label>
          <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="password">
        </div>
        <div class="checkbox">
          <label><input type="checkbox"> Remember me</label>
        </div>
        <button type="button" id="login" class="btn btn-default">Submit</button>
      </form>
    </div>
    
    

    <script src="bootstrap/js/jquery.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript">
    
    $('#login').click(function(){
    	if($('#email').val() === "")
    	{
    		alert("Email can't be empty");
    		return false;
    	}
    	if($('#pwd').val() === "")
    	{
    		alert("Password can't be empty");
    		return false;
    	}
    	$('form').submit();
    	
    });
    
    </script>
  </body>
</html>
