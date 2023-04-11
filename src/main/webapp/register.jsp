<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
body {
	padding: 0%;
	margin: 0%;
	background-image: url("https://img.freepik.com/free-vector/banner-with-boy-girl_1308-32521.jpg?w=1380&t=st=1680844272~exp=1680844872~hmac=e6d6207ca2fb0bdde84a15c8103a0e5fa8336f500a98d480c9f2b374713e6979" );
	background-repeat: no-repeat;
}

td {
	padding: 2%;
	font-size: 30px;
	font-family: inherit;
}

input {
	height: 30px;
	width: 120px;
}

.req:after {
	content: "*";
	color: red;
	font-size: medium;
	position: relative;
	bottom: 10px;
}



form {
	padding-top:6%;
	padding-right:15%;
	color: white;
}


input:hover {
	color: blue;
}
a{color: white;}
a:hover {
	color: red;
}
</style>
<center>
	<body>
		<script type="text/javascript">
		function calculateAge() {
			  const dob = new Date(document.getElementById("dob").value);
			  const today = new Date();
			  const age = Math.floor((today - dob) / (365.25 * 24 * 60 * 60 * 1000));
			  document.getElementById("age").value = age;
			}
		
    </script>

		<form action="register" method="post" id="fo"">
			<table >
				<div class="required">
					<tr >
						<td ><label for="firstName" class="req" > First Name </label></td>
						<td><input pattern="[a-zA-Z]*"
							oninvalid="setCustomValidity('Please Enter alphabets only')"
							type="text" placeholder="FirstName" name="firstName"
							required="required"></td>
					</tr>

					<tr>
						<td><label for="lastName" class="req"> Last Name </label></td>
						<td><input pattern="[a-zA-Z]*"
							oninvalid="setCustomValidity('Please Enter alphabets only')"
							type="text" placeholder="LastName" required="required"
							name="lastName"></td>
					</tr>

					<tr>
					
						<td>
						<label for="dob" class="req" id="date" >Date Of
								Birth</label></td>
						<td><input type="date" id="dob"  required="required"
							name="dob" max="2023-04-12" onchange="calculateAge();"></td>
					</tr>

					<tr>
						<td><label for="age"> Age </label></td>
						<td><input type="number" disabled="disabled" id="age" name="age"> </td>
					</tr>

					<tr>
						<td><label for="gender" id="gender" class="req">Gender </label></td>
						<td><select id="gender" name="gender">
								<option value="male" selected="selected">Male</option>
								<option value="female">FEMALE</option>

						</select></td>

					</tr>
					<tr>
						<td><label for="grade" class="req"> Grade </label></td>
						<td><input type="tel" required="required" maxlength="2"
							name="grade" placeholder="Grade"></td>
					</tr>
				</div>

				<tr>
					<td>
					<br>
						<center>
							<input type="submit" placeholder="SUBMIT" style="width: 80px; ">
						</center>
					</td>
				</tr>



			</table>
			<br> <a href="index.jsp" > HOME </a>

		</form>


	</body>
</center>
</html>