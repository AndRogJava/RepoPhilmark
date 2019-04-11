<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Sign up</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<link href="../style/style.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="../style/signup.css">
<script src="../script/signup.js"></script>
</head>
<body>
<iframe id="nav" src="section/navbar.jsp"></iframe>
	<div id="container">
		<h2>Sign up</h2>
	
		<form class="needs-validation" novalidate>
		  <div class="form-row">
		    <div class="col-md-4 mb-3">
		      <label for="validationCustom01">First name</label>
		      <input type="text" class="form-control" id="validationCustom01" placeholder="First name" required>
		      <div class="valid-feedback">
		        Looks good!
		      </div>
		    </div>
		    <div class="col-md-4 mb-3">
		      <label for="validationCustom02">Last name</label>
		      <input type="text" class="form-control" id="validationCustom02" placeholder="Last name" required>
		      <div class="valid-feedback">
		        Looks good!
		      </div>
		    </div>
		    
		    <div class="col-md-4 mb-3">
		      <label for="validationCustomUsername">E-mail</label>
		      <input type="email" class="form-control" id="validationCustomMail" placeholder="Username" required>
		      <div class="valid-feedback">
		        Looks good!
		      </div>
		    </div>
		    
		    <div class="col-md-4 mb-3">
		      <label for="validationCustomMail">E-mail</label>
		      <input type="email" class="form-control" id="validationCustomMail" placeholder="E-mail" required>
		      <div class="valid-feedback">
		        Looks good!
		      </div>
		    </div>
		    
		    <div class="col-md-4 mb-3">
		      <label for="validationCustomPass">Password</label>
		      <div class="input-group">
		        <input type="text" class="form-control" id="validationCustomPass" placeholder="Password" aria-describedby="inputGroupPrepend" required>
		        <div class="invalid-feedback">
		          Please choose a password.
		        </div>
		      </div>
		    </div>
		    
		    <div class="col-md-4 mb-3">
		      <label for="validationCustomPass">Confirm Password</label>
		      <div class="input-group">
		        <input type="text" class="form-control" id="validationCustomPass" placeholder="Confirm Password" aria-describedby="inputGroupPrepend" required>
		        <div class="invalid-feedback">
		          The password must be the same.
		        </div>
		      </div>
		    </div>
		  </div>
		  
		  <div class="form-row">
		    <div class="col-md-6 mb-3">
		      <label for="validationCustom03">City</label>
		      <input type="text" class="form-control" id="validationCustom03" placeholder="City" required>
		      <div class="invalid-feedback">
		        Please provide a valid city.
		      </div>
		    </div>
		    <div class="col-md-3 mb-3">
		      <label for="validationCustom04">Address</label>
		      <input type="text" class="form-control" id="validationCustom04" placeholder="State" required>
		      <div class="invalid-feedback">
		        Please provide a valid address.
		      </div>
		    </div>
		    <div class="col-md-3 mb-3">
		      <label for="validationCustom05">Zip</label>
		      <input type="text" class="form-control" id="validationCustom05" placeholder="Zip" required>
		      <div class="invalid-feedback">
		        Please provide a valid zip.
		      </div>
		    </div>
		    <div class="col-md-1 mb-3">
		      <label for="validationCustom05">Province</label>
		      <input type="text" class="form-control" id="validationCustom05" placeholder="Province" required>
		      <div class="invalid-feedback">
		        Please provide a valid province.
		      </div>
		    </div>
		  </div>
		  <div class="form-group">
		    <div class="form-check">
		      <input class="form-check-input" type="checkbox" value="" id="invalidCheck" required>
		      <label class="form-check-label" for="invalidCheck">
		        Agree to terms and conditions
		      </label>
		      <div class="invalid-feedback">
		        You must agree before submitting.
		      </div>
		    </div>
		  </div>
		  <button class="btn btn-primary" type="submit">Submit form</button>
		</form>
	</div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>