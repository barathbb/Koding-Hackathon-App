<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<div class="container">
<h2>Registration Page</h2>
      <form role="form">

      <form role="form" method="post">

	 <div class="form-group">
          <label for="title">Compliant Title</label>
          <input type="text" class="form-control" id="email" placeholder="Enter Your Name" name="username">
        </div>
        <div class="form-group">
          <label for="description">Text Area</label>
    	<textarea class="form-control" rows="3"></textarea>
        </div>
        <div class="form-group">
          <label for="pwd">Password:</label>
          <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="password">
        </div>
        <div class="form-group">
          <label for="pwd">Repeat Password:</label>
          <input type="password" class="form-control" id="repwd" placeholder="Enter password again" name="password">
        </div>
        
        <div class="btn-group">
  <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
    Choose Your Area
    <span class="caret"></span>
  </a>
  <ul class="dropdown-menu" id="area">
    <!-- dropdown menu links -->

  </ul>
</div>
        
        <button type="submit" class="btn btn-default">Submit</button>
      </form>
      </form>
      </div>  <script src="bootstrap/js/jquery.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>

</body>
</html>