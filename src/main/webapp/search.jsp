<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
* {
	margin: 0;
	padding: 0;
	font-weight: bold;
}

img {
	padding-left: 10%;
}

#one {
	position: relative;
	bottom: 500px;
	right: 50px;
	background-color: transparent;
}
#one button{
background-color: transparent;
color: white;
border: none;
}

#one button:hover{ background-color: red;}

div {
	padding-left: 20%;
}

#two {
	padding-right: 20%;
	position: relative;
	bottom: 280px;
	right: 50px;
}
#two button{color:#ff6b01; background-color: transparent; border:none; font-weight: bold; font-size: large; }
#two button:hover{color: activeborder; }
a {
	width: 80px;
}
</style>
</head>


<body>
<script type="text/javascript">

</script>
	<img alt=""
		src="https://media.gettyimages.com/id/1148218795/photo/children-cheering-in-classroom.jpg?s=612x612&w=gi&k=20&c=mAtT-rGxoV7dfjAoTlnB9ic6D2Y2ev0j1eYnsHye-PQ="
		height="750px"; >
		<section>
		<a href="admin.jsp"> <button style="opacity: .3;"> ADMIN </button> </a> &nbsp; &nbsp; &nbsp;
	<a href="index.jsp"> HOME </a>
		</section>
	<div style="display: flex; justify-content: space-between; width: 60%;"
		id="one">
		<h1 style="color: white;">Search based on filter</h1>
		<a href="register">
			<button>Click Here to Search By Order of Name</button>
		</a> <a href="get">
		
			<button>Click Here to Search By Order of Grade</button> </a>
	</div>
	<br>
	<br>

	<div style="display: flex; justify-content: space-between;" id="two">
		<h1 style="color: #ff6b01;">Customized Search</h1>
		
		</a> <a href="search3.jsp">
			<button >Click Here to Search By Name</button>
		</a> <a href="search4.jsp">
			<button>Click Here to Search By Grade</button>
		</a>
	</div>
	<br>
	<br>

</body>
</html>