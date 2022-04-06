
<html>
<head>
<title>Welcome</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
rel="stylesheet">
</head>
<body> <h2>
Welcome ${User} to the website.Current Date and Time is <span id='date-time'></span>
</h2>
<div>
<ul>
<li><a href="/registration">Employee Registration</a></li>
<li><a href="/update">Update Employee</a></li>
<li><a href="/delete">Delete Employee</a></li>
</ul>
</div> <script>
var dt = new Date();
document.getElementById('date-time').innerHTML = dt;
</script>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>


