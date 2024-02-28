<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="/includes/head.jsp"%>
<title>CampusShare Cart</title>
</head>
<body>
	

	<div class="container">
		<div class="card w-50 mx-auto my-5">
			<div class="card-header text-center">User Login</div>
			<div class="card-body">
				<form action="javaservlet" method="post">
					<div class="form-group">
						<label>Name</label> 
						<input type=text name=textName class="form-control" placeholder="Enter Name">
					</div>
					<div class="form-group">
						<label>Password</label> 
						<input type=password name=textPwd class="form-control" placeholder="Password">
					</div>
					<div class="text-center">
						<button type="submit" value=Login class="btn btn-primary">Login</button>
					</div>
				</form>
			</div>
		</div>
	</div>

	<%@include file="/includes/footer.jsp"%>


</body>
</html>