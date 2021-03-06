<%@ page import="com.app.util.Areas" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    </head>
<body>
 <div class="container">
<h2>Registration Page</h2>
      <form role="form">

      <form role="form" method="post" action="/Register">

	 <div class="form-group">
          <label for="text">User Name</label>
          <input type="text" class="form-control" id="name" placeholder="Enter Your Name" name="username">
        </div>
        <div class="form-group">
          <label for="email">Email:</label>
          <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
        </div>
        <div class="form-group">
          <label for="pwd">Password:</label>
          <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="password">
        </div>
        <div class="form-group">
          <label for="pwd">Repeat Password:</label>
          <input type="password" class="form-control" id="repwd" placeholder="Enter password again" name="password">
        </div>
        
        

		<div class="form-group">
		    <label for="sel1">Choose Your Area</label>
		      <select class="form-control" id="area">
		           <%=Areas.getInstance().getArea() %>
		       </select>
		</div>
		
        <div class="form-group">
        <button type="submit" class="btn btn-default" name="register">Submit</button>
        </div>
      </form>
      </form>
      </div>
      
    <script src="bootstrap/js/jquery.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript">
    
    $('#name').bind('blur',function(){
    	var input = $(this);
    	$.ajax({
			url 		: "/CheckUserName",
			type 		: 'GET',
			beforeSend 	: function()
						  {
// 							this.data = "username=" + $(this).val();
						  },
			data		: 'username=' + $(this).val(),
		    success		: function(response, status, xhr)
		    			  {
		    					if(response === "True")
		    					{
		    						$(input).css('border','2px green solid');
		    					}
		    					else
		    					{
		    						$(input).css('border','2px red solid');
		    					}
		    			  }
		});
    });
    $('#email').bind('blur',function(){
    	var input = $(this);
    	$.ajax({
			url 		: "/CheckEmailId",
			type 		: 'GET',
			beforeSend 	: function()
						  {
// 							this.data = "username=" + $(this).val();
						  },
			data		: 'emailid=' + $(this).val(),
		    success		: function(response, status, xhr)
		    			  {
		    					if(response === "True")
		    					{
		    						$(input).css('border','2px green solid');
		    					}
		    					else
		    					{
		    						$(input).css('border','2px red solid');
		    					}
		    			  }
		});
    });
    
    
    
    </script>
</body>

</html>